package pattern.proxyPattern.staticProxyPattern;

/**
 * Created by Alexhu on 2017/8/15.
 * 本例实现一个简单的：代理模式
 */
public class BigImage implements Image {

    public BigImage() {
        try {
            // 程序暂停3s模式模拟系统开销
            Thread.sleep(3000);
            System.out.println("图片装载成功.....");
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void show() {
        System.out.println("绘制实际的大图片");
    }
}
