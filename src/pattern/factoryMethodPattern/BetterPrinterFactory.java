package pattern.factoryMethodPattern;

/**
 * Created by Alexhu on 2017/8/15.
 */
public class BetterPrinterFactory implements OutputFactory {

    public Output getOutput() {

        // 该工厂只负责产生BetterPrinter对象
        return new BetterPrinter();
    }
}
