package factory;

/**
 * @author by Eric
 * @since 2020/9/9 下午 02:01
 */
public class FactoryPatternDemo {
    public static void main(String [] args){
        /**
         * Shape Factory have one action is draw and it can draw three type.
         * so we need to a interface to switch type for draw square, circle or rectangle.
         * This pattern involve one interface, three shapeType and one factory.
         */
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE.getType());
        circle.draw();
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE.getType());
        rectangle.draw();
        Shape square = shapeFactory.getShape(ShapeType.SQUARE.getType());
        square.draw();
    }
}

