package reflection.model;

import java.time.LocalDateTime;

public class SimpleModelParent {

    private LocalDateTime createDate;

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}
