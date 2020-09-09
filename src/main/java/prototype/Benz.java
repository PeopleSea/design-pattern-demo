package prototype;

/**
 * @author by Eric
 * @since 2020/9/9 下午 03:55
 */
public class Benz extends Car{
    public Benz(){
        type = "Benz";
    }

    @Override
    void brand() {
        System.out.println("Inside Benz:: brand() method.");
    }
}
