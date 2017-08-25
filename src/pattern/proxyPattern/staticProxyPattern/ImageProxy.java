package pattern.proxyPattern.staticProxyPattern;

/**
 * Created by Alexhu on 2017/8/15.
 */
public class ImageProxy implements Image {

    // 组合一个image实例，作为被代理的对象
    private Image image;

    // 使用抽象实体来初始化代理对象
    public ImageProxy(Image image) {
        this.image = image;
    }

    /**
     * 重写Image接口的show()方法
     * 该方法用于控制对被代理对象的访问
     * 并根据需要负责创建和删除被代理对象
     */
    public void show() {

        // 只有当真正需要调用image的show方法时才创建被代理对象
        if (image == null) {
            image = new BigImage();
        }

        image.show();
    }
}
