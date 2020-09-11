package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by Eric
 * @since 2020/9/11 下午 03:37
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer: observers){
            observer.update();
        }
    }
}
