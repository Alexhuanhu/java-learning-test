package pattern.commandPattern;

/**
 * Created by Alexhu on 2017/8/16.
 * 命令模式--- 以 对一个数组中的元素跟进输入对象包含的方法不同，采取不同响应 为例子
 */
public class ProcessArray {

    // 定义一个each()方法，用于处理数组
    public void each(int[] target, Command cmd) {
        cmd.process(target);
    }
}
