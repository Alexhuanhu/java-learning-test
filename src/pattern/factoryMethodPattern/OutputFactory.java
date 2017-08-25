package pattern.factoryMethodPattern;

/**
 * Created by Alexhu on 2017/8/15.
 */
public interface OutputFactory {

    // 仅定义一个方法用于返回输出设备
    Output getOutput();
}
