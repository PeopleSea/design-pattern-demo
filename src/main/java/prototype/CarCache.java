package prototype;

import java.util.HashMap;

/**
 * @author by Eric
 * @since 2020/9/9 下午 04:00
 */
public class ShapeCache {
    private static HashMap<String, Object>  carMap = new HashMap<String, Object>();
    public static Car getCar(String brandId){
        Car cachedCar = carMap.get(brandId);
        return (Car)cachedCar.clone();
    }
}
