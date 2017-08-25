import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Alexhu on 2017/8/7.
 * 正则表达式的测试
 */
public class RegExpTest {

    public static void main(String[] args) {
        String str = "广州市(番禺区)(天河区)(越秀区)";
        Pattern p = Pattern.compile(".*?(?=\\()");
        Matcher m = p.matcher(str);

        if (m.find()) {
            System.out.println(m.group());
        }
    }
}
