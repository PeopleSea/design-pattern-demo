package abs.factory;

/**
 * @author by Eric
 * @since 2020/9/9 下午 02:55
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory2();
        }
    }
}
