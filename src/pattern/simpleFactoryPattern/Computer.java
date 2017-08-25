package pattern.simpleFactoryPattern;

/**
 * Created by Alexhu on 2017/8/15.
 */
public class Computer {
    private Output out;
    public Computer(Output out) {
        this.out = out;
    }

    // 定义一个模拟获取字符串输入的方法
    public void keyIn(String msg) {
        out.getData(msg);
    }

    // 定义一个模拟打印的方法
    public void print() {
        out.out();
    }

    public static void main(String[] args) {
        // 创建OutputFactory
        OutputFactory of = new OutputFactory();

        // 将 Output对象传入，创建Computer对象
        Computer c = new Computer(of.getOutput());
        c.keyIn("轻量级Java EE企业应用实战");
        c.keyIn("疯狂Java讲义");
        c.print();
    }
}
