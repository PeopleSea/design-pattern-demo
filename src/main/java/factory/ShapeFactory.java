package factory;

/**
 * @author by Eric
 * @since 2020/9/9 下午 01:52
 */
public class ShapeFactory {

    private static String CIRCLE = "CIRCLE";

    private static String SQUARE = "SQUARE";

    private static String RECTANGLE = "RECTANGLE";

    public Shape getShape(String shapeType){

        if(null == shapeType){
            return null;
        }
        if(shapeType.equalsIgnoreCase(CIRCLE)){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase(SQUARE)){
            return new Square();
        }
        if(shapeType.equalsIgnoreCase(RECTANGLE)){
            return new Rectangle();
        }
        return null;
    }
}
