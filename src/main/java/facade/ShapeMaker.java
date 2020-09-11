package facade;

import factory.Circle;
import factory.Rectangle;
import factory.Shape;
import factory.Square;

/**
 * @author by Eric
 * @since 2020/9/11 下午 01:35
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
