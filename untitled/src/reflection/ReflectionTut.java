package reflection;

import reflection.annotation.KeyMap;
import reflection.model.SimpleModel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReflectionTut {

    public static void main(String[] args) throws Exception {
//        callMethod();
//        makeClass();
        getConstructors();
    }

    static void getConstructors() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?>[] constructors = SimpleModel.class.getConstructors();
        System.out.println();
        Object o = constructors[0].newInstance();
        System.out.println();
    }

    static void makeClass() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("reflection.model.SimpleModel");
        System.out.println();
    }

    static void makeMap(){
        SimpleModel sm1 = new SimpleModel();
        sm1.setModelName("First");
        sm1.setModelNum(1);

        SimpleModel sm2 = new SimpleModel();
        sm2.setModelName("Second");
        sm2.setModelNum(2);

        SimpleModel sm3 = new SimpleModel();
        sm3.setModelName("Third");
        sm3.setModelNum(3);

        Map<String, Object> map = makeMap(List.of(sm1, sm2, sm3));
        System.out.println();
    }

    static void callMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<SimpleModel> simpleModelClass = SimpleModel.class;
        Method[] declaredMethods = simpleModelClass.getDeclaredMethods();
        Field[] declaredFields = simpleModelClass.getDeclaredFields();
        System.out.println();

        Method method = simpleModelClass.getMethod("printModel");
        method.invoke(new SimpleModel());
    }

    static Map<String, Object> makeMap(List<Object> objects){
        return objects.stream().collect(
                Collectors.toMap(
                        ReflectionTut::keyMap,
                        o -> o
                )
        );
    }

    private static String keyMap(Object o){
        Class<?> aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            if(field.isAnnotationPresent(KeyMap.class)){
                field.setAccessible(true);
                try {
                    Object o1 = field.get(o);
                    return o1.toString();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        throw new IllegalArgumentException();
    }

}
