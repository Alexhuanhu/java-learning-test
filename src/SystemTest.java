import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Alexhu on 2017/7/26.
 */
public class SystemTest {
    public static void main(String[] args) throws Exception {
        Map<String, String> env = System.getenv();
        for (String name : env.keySet()) {
            System.out.println(name + "----->" + env.get(name));
        }

        System.out.println(System.getenv("JAVA_HOME"));

        Properties props = System.getProperties();

        props.store(new FileOutputStream("props.txt"), "System Properties");

        System.out.println(System.getProperty("os.name"));
    }
}
