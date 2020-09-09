package abs.factory;

import factory.Shape;

/**
 * @author by Eric
 * @since 2020/9/9 下午 02:43
 */
public abstract class AbstractFactory {

    abstract Shape getShape(String shapeType);
}
