package pattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexhu on 2017/8/16.
 */
public abstract class Observable extends java.util.Observable {

    // 用一个List来保存该对象上所有绑定的事件监听器
    List<Observer> observerList = new ArrayList<Observer>();

    // 定义一个方法，用于从该主题上注册观察者
    public void registObserver(Observer o) {
        observerList.add(o);
    }

    // 定义一个方法，用于从该主题中删除观察者
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    // 通知该主题上注册的所有观察者
    public void notifyObservers(Object value) {
        // 遍历注册到 该观察者 上的所有 观察者
        for (Observer o : observerList) {
            // 显示调用每个观察者的 update() 方法
            o.update(this, value);
        }
    }

}
