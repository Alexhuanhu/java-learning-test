package pattern.commandPattern;

/**
 * Created by Alexhu on 2017/8/16.
 */
public interface Command {

    // 接口里定义的process()方法用于封装"处理行为"
    void process(int[] target);
}
