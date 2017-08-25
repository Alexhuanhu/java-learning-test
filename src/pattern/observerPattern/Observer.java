package pattern.observerPattern;

/**
 * Created by Alexhu on 2017/8/16.
 * 观察者 接口; 程序中所有 观察者都应该实现该接口
 */
public interface Observer {

    /**
     *
     * @param o  代表被观察对象
     * @param arg  抽象基类
     */
    void update(pattern.observerPattern.Observable o, Object arg);
}
