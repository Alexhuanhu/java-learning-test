package pattern.proxyPattern.dynamicProxyPattern;

/**
 * Created by Alexhu on 2017/8/15.
 * 动态代理模式 测试用例
 */
public class Test {

    public static void main(String[] args) throws Exception {
        // 创建一个原始的GunDog对象，作为target
        GunDog target = new GunDog();

        // 以指定的target来创建动态代理
        Dog dog = (Dog) MyProxyFactory.getProxy(target);

        // 调用代理对象的info()和run()方法
        dog.info();
        dog.run();
    }
}
