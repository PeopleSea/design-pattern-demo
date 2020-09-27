package singleton;

/**
 * Singleton Demo
 * @author by Eric
 * @since 2020/9/9 下午 01:11
 */
public class SingleObjectDemo {
    public static void main(String [] args){

        //illegal error
        //Compile Time Error: The Constructor SingletonObject is not visible
        //SingletonObject singletonObject =  new SingletonObject();

        //Get the only one available
        SingletonObject singletonObject= SingletonObject.getInstance();

        //use the only one available object to showMessage
        singletonObject.showMessage();
    }

}
