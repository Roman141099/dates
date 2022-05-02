package reflection.model;

import reflection.annotation.KeyMap;

public class SimpleModel extends SimpleModelParent{

    @KeyMap
    private String modelName;
    private int modelNum;

    public void printModel(){
        System.out.println(modelName + " " + modelNum);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }
}
