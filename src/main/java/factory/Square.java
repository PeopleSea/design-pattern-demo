package factory;

/**
 * @author by Eric
 * @since 2020/9/9 下午 01:48
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
