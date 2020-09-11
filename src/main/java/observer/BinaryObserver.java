package observer;

/**
 * @author by Eric
 * @since 2020/9/11 下午 07:58
 */
public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: : " + Integer.toBinaryString(subject.getState()));
    }
}
