import java.util.Date;

import static java.lang.Math.sin;

/**
 * Created by Alexhu on 2017/7/27.
 */
public class stringGetBytesTest {

    public static void main(String[] args) {
        String inputStr = "hello world!";

        byte[] bytes = inputStr.getBytes();

        System.out.println(bytes.length);

//        for (int i = 0; i < bytes.length; i++) {
//            System.out.println(bytes[i]);
//        }

        String str1 = "java";
        str1 += "struts";
        str1 += "spring";

        System.out.println(str1);

        System.out.println(Math.cbrt(27));

        System.out.println(new Date());

    }


}
