package singleton;

/**
 * Singleton main Object
 * This pattern is involve a simple class which is responsible to create a object
 * while make sure that only single object gets created
 * @author by Eric
 * @since 2020/9/9 下午 01:07
 */
public class SingletonObject {

    // create a object of SintonOnject
    private static SingletonObject instance= new SingletonObject();

    // make the constructor private so that this class can't be instantiated
    private SingletonObject(){}

    // get the only available object
    public static SingletonObject getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello this is singleton showMessage");
    }
}
