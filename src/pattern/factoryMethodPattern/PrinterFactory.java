package pattern.factoryMethodPattern;

/**
 * Created by Alexhu on 2017/8/15.
 */
public class PrinterFactory implements OutputFactory {

    public Output getOutput() {

        // 该工厂只负责产生Printer对象
        return new Printer();
    }
}
