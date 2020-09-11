package facade;

/**
 * @author by Eric
 * @since 2020/9/11 下午 01:40
 */
public class FacadePatternDemo {

    /**
     * depend on factory pattern's shape interface then
     * just need to add a shapeMaker to provide draw function.
     * @param srgs
     */

    public static void main(String [] srgs){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
