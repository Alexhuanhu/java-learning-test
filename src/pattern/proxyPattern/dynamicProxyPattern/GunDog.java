package pattern.proxyPattern.dynamicProxyPattern;

/**
 * Created by Alexhu on 2017/8/15.
 */
public class GunDog implements Dog {

    // run() 方法实现，仅仅打印一个字符串
    public void info() {
        System.out.println("我是一只猎狗");
    }

    // run() 方法实现，仅仅打印一个字符串
    public void run() {
        System.out.println("我奔跑迅速");
    }
}
