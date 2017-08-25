package pattern.observerPattern;

/**
 * Created by Alexhu on 2017/8/16.
 */
public class PriceObserver implements Observer {

    // 实现观察者必须实现的 update()方法
    public void update(Observable o, Object arg) {
        if (arg instanceof Double) {
            System.out.println("价格观察者：" +
                o + "物品价格已经改变为：" + arg);
        }
    }
}
