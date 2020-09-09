package prototype;

/**
 * @author by Eric
 * @since 2020/9/9 下午 04:11
 */
public class PrototypePatternDemo {
    public static void main(String [] args){
        CarCache.loadCache();
        Car benz = CarCache.getCar("1");
        System.out.println("Car : " + benz.getType());
        Car bmw = CarCache.getCar("2");
        System.out.println("Car : " + bmw.getType());
    }
}
