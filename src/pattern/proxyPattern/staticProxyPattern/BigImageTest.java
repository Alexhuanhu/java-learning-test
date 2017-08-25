package pattern.proxyPattern.staticProxyPattern;

/**
 * Created by Alexhu on 2017/8/15.
 * 静态 代理模式
 */
public class BigImageTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // 程序返回一个Image对象，该对象只是BigImage的代理对象
        Image image = new ImageProxy(null);
        System.out.println("系统得到image对象的时间开销：" +
                (System.currentTimeMillis() - start));

        // 只有当实际调用image代理的show()方法时，程序才会真正创建被代理对象
        image.show();
    }
}
