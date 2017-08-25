package pattern.observerPattern;

/**
 * Created by Alexhu on 2017/8/16.
 * 观察者模式 测试用例
 */
public class Test {

    public static void main(String[] args) {

        // 创建一个被观察者对象
        Product product = new Product("电视机", 176);

        // 创建两个观察者对象
        NameObserver nameObserver = new NameObserver();
        PriceObserver priceObserver = new PriceObserver();

        // 向被观察对象上注册两个观察者对象
        product.registObserver(nameObserver);
        product.registObserver(priceObserver);

        // 程序调用setter方法来改变Product的name和price成员变量
        product.setName("书桌");
        product.setPrice(345f);
    }
}
