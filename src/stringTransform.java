import java.io.UnsupportedEncodingException;

/**
 * Created by Alexhu on 2017/8/4.
 * 用于测试将字符串从GB2312编码转为ISO-8859-1编码方式
 */
public class stringTransform {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "你好";
        String strResult = new String(str.getBytes("GB2312"), "ISO-8859-1");

        System.out.println(str + " -----" + strResult);
    }
}
