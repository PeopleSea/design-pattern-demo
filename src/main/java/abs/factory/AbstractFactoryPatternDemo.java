package abs.factory;

import factory.Shape;
import factory.ShapeType;

/**
 * @author by Eric
 * @since 2020/9/9 下午 02:57
 */
public class AbstractFactoryPatternDemo {
    public static void main(String [] args){

        /**
         * Abstract Factory Pattern extended from Factory Pattern
         * this pattern's purpose is for add and manage a new factory,
         * so it need a abstract class to manage factory and one new factory
         * if you want to create a shapeType it is ok.
         * After create Abstract Factory, it need a Producer to provide which factory draws the shape.
         */
        AbstractFactory absFactory = FactoryProducer.getFactory(false);
        Shape rectangle = absFactory.getShape(ShapeType.RECTANGLE.getType());
        rectangle.draw();
        Shape shape = absFactory.getShape(ShapeType.SQUARE.getType());
        shape.draw();

        AbstractFactory factory = FactoryProducer.getFactory(true);
        Shape roundedRectangle = factory.getShape(ShapeType.ROUNDED_RECTANGLE.getType());
        roundedRectangle.draw();
        Shape roundedSquare = factory.getShape(ShapeType.ROUNDED_SQUARE.getType());
        roundedSquare.draw();

    }


}
