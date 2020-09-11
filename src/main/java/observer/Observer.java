package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by Eric
 * @since 2020/9/11 下午 06:04
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
