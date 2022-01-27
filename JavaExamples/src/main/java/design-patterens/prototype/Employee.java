package design;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Employee implements Cloneable {

    private String name;
    private String empId;
    private String dept;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
