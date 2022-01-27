package design;

public class PrototypeExample {

    public static void main(String[] a) throws CloneNotSupportedException {
        Employee emp = new Employee();
        Employee emp1 = (Employee) emp.clone();
        Employee emp2 = emp;
        System.out.println(emp == emp1);
        System.out.println(emp == emp2);
    }

}
