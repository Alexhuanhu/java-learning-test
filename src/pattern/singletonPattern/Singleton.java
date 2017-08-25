package pattern.singletonPattern; /**
 * Created by Alexhu on 2017/8/8.
 * 单例模式的两个实现例子
 *
 */

/**
 * 懒汉式单例(该例子比较标准)
 */
public class Singleton {
    // 使用一个类变量缓存曾经创建的实例
    private static Singleton instance = null;

    // 将构造器使用private修饰，隐藏该构造器
    private Singleton() {}

    // 提供一个静态方法，用于返回ingleton实例
    // 该方法可以加入自定义的控制，保证只产生一个Singleton对象
    public static synchronized Singleton getInstance() {
        // 如果instance为null，表明还不曾创建Singleton对象
        // 如果instance不为null，则表明已经创建了Singleton对象，将不会执行该方法
        if (instance == null) {
            // 创建一个Singleton对象，并将其缓存起来
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        // 创建Singleton对象不能通过构造器，只能通过getInstance方法
        Singleton singletonOne = Singleton.getInstance();
        Singleton singletonTwo = Singleton.getInstance();

        System.out.println(singletonOne == singletonTwo);
    }
}
