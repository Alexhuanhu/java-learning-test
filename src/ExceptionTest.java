import java.lang.reflect.Array;

/**
 * Created by Alexhu on 2017/7/26.
 * try...catch...finally 异常处理
 */
public class ExceptionTest {
    public static void main(String[] args) {

        try {
            String[] strArr = new String[4];

            int i = 6 / 0;

            String str = strArr[7];

        }
        catch(ArithmeticException ae) {
            System.out.println("A");
        }
        catch(ArrayIndexOutOfBoundsException aae) {
            System.out.println("B");
        }
        catch(Exception e) {
            System.out.println("C");
        }

        System.out.println("D");
    }


}
