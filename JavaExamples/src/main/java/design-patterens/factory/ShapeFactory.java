package design;

import com.example.demo.design.patterens.factory.service.Reactangle;
import com.example.demo.design.patterens.factory.service.Shape;
import com.example.demo.design.patterens.factory.service.Square;

public class ShapeFactory {

    public static Shape getShape(String shape) {
        Shape obj = null;
        switch(Shapes.valueOf(shape.toUpperCase())) {
            case REACTANGLE:
                obj = new Reactangle();
                break;
            case SQUARE:
                obj = new Square();
                break;
        }
        return obj;
    }

}

enum Shapes {
    REACTANGLE, SQUARE
}