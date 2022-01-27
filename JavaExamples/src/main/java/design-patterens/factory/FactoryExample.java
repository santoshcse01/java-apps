package design;

public class FactoryExample {

    public static void main(String []a) {
        ShapeFactory.getShape("reactangle").draw();
        ShapeFactory.getShape("square").draw();
    }

}
