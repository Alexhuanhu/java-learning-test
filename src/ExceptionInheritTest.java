/**
 * Created by Alexhu on 2017/8/4.
 * 根据里氏代换原则（能使用父类型的地方，一定能使用子类型），抓取ExampleA类型异常的catch块能够抓住
 * try块中抛出的ExampleB类型的异常
 */
public class ExceptionInheritTest {

    public static void main(String[] args) {

        try {
            throw new ExampleB("b");
        }
        catch (ExampleA e) {
            System.out.println("ExampleA");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

class ExampleA extends Exception {

}

class ExampleB extends ExampleA {

    public ExampleB(String test) {
        System.out.println("ExampleB constructor result");
    }

}