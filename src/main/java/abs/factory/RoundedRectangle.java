package abs.factory;

import factory.Shape;

/**
 * @author by Eric
 * @since 2020/9/9 下午 02:40
 */
public class RoundedRectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle:: draw() method.");
    }
}
