package factory;

/**
 * @author by Eric
 * @since 2020/9/9 下午 01:51
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
