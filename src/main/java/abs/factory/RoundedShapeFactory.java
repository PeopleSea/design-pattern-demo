package abs.factory;

import factory.Shape;
import factory.ShapeType;

/**
 * @author by Eric
 * @since 2020/9/9 下午 02:49
 */
public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase(ShapeType.ROUNDED_RECTANGLE.getType())){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase(ShapeType.ROUNDED_SQUARE.getType())){
            return new RoundedSquare();
        }
        return null;
    }
}
