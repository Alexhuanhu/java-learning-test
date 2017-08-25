package pattern.facadePattern;

/**
 * Created by Alexhu on 2017/8/16.
 * 门面模式 测试用例
 */
public class Test {

    public static void main(String[] args) {
        // 客户A
        Customer customerOne = new Customer();
        customerOne.havaDinnerByFacadeClass();

        System.out.println("-----------------");

        // 客户B
        Customer customerTwo = new Customer();
        customerTwo.havaDinnerByFacadeClass();
    }

}
