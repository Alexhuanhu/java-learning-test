import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexhu on 2017/7/31.
 */
public class AutoUnboxingTest {

    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = 3;      // 3 自动装箱成 Integer类型
        int c = 3;
        System.out.println(a == b);
        System.out.println(a == c);     // true  a 自动拆箱成int类型再和c比较

        String s1 = new StringBuilder("go").append("od").toString();
        System.out.println(s1.intern() == s1);

        String s2 = new StringBuilder("ja").append("va").toString();
        System.out.println(s2.intern() == s2);

        String str = "hello world!";
        System.out.println(str.length());

    }
}
