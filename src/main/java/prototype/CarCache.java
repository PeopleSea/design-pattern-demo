package prototype;

import java.util.HashMap;

/**
 * @author by Eric
 * @since 2020/9/9 下午 04:00
 */
public class CarCache {
    private static HashMap<String, Car>  carMap = new HashMap<String, Car>();
    public static Car getCar(String brandId){
        Car cachedCar = carMap.get(brandId);
        return (Car)cachedCar.clone();
    }

    public static void loadCache(){
        Benz benz = new Benz();
        benz.setId("1");
        carMap.put(benz.getId(), benz);
        Bmw bmw = new Bmw();
        bmw.setId("2");
        carMap.put(bmw.getId(), bmw);
    }
}
