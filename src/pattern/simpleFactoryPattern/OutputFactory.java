package pattern.simpleFactoryPattern;

/**
 * Created by Alexhu on 2017/8/15.
 */
public class OutputFactory {

    public Output getOutput() {

        // 下面两行代码用于控制系统到底使用Output的哪个实现类: BetterPrinter 或者 Printer
//        return new Printer();

        return new BetterPrinter();
    }
}
