package factory;

/**
 * @author by Eric
 * @since 2020/9/9 下午 01:46
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
