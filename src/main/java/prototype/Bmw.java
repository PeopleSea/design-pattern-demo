package prototype;

/**
 * @author by Eric
 * @since 2020/9/9 下午 03:58
 */
public class Bmw extends Car{

    public Bmw(){
        type = "Bmw";
    }

    @Override
    void brand() {
        System.out.println("Inside Bmw:: brand() method.");
    }
}
