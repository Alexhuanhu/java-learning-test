import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Alexhu on 2017/7/26.
 */
public class AccessExceptionMsg {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
        }
        catch(IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }
    }
}
