import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Alexhu on 2017/7/26.
 * 本文件用于测试 try...catch...finally 中finally使用
 */
public class FinallyTest {

    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
        }
        catch(IOException ioe) {
            System.out.println(ioe.getMessage());

            return;     // 使用return，一定会执行 finally块
//            System.exit(1);     // 使用exit,会退出虚拟机；finally块不会得到执行
        }
        finally {
            if (fis != null) {
                try {
                    fis.close();
                }
                catch(IOException ioe) {
                    ioe.printStackTrace();
                }
            }

            System.out.println("执行finally块里的资源回收!");
        }
    }
}
