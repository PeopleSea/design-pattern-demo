package abs.factory;

import factory.Rectangle;
import factory.Shape;
import factory.ShapeType;
import factory.Square;

/**
 * @author by Eric
 * @since 2020/9/9 下午 02:46
 */
public class ShapeFactory2 extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase(ShapeType.RECTANGLE.getType())){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase(ShapeType.SQUARE.getType())){
            return new Square();
        }
        return null;
    }
}
