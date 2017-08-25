package pattern.singletonPattern;

/**
 * Created by Alexhu on 2017/8/8.
 * 单例模式的两个例子
 * 注意：实现一个单例有两点注意事项：
 * 1.将构造器私有，不允许外界通过构造器创建对象；
 * 2.通过公开的静态方法向外界返回类的唯一实例。
 */

/**
 * 饿汉式单例
 */
public class SingletonUnused {

    private SingletonUnused() {}
    private static SingletonUnused instance = new SingletonUnused();
    public static SingletonUnused getInstance() {
        return instance;
    }
}
