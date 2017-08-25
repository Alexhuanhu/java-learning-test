import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Alexhu on 2017/7/26.
 * throws 声明抛出只能在方法签名中使用
 *
 * 大部分时候，建议使用 Runtime异常（例如try...catch捕获的异常），
 * 而不使用Checked异常（例如 throws 抛出的异常）
 */
public class ThrowsTest {

    public static void main(String[] args) throws Exception {
        test();
    }

    public static void test() throws IOException {

        FileInputStream fis = new FileInputStream("a.txt");
    }
}
