import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Alexhu on 2017/8/7.
 * 写一个方法，输入一个文件名和一个字符串，统计这个字符串在这个文件中出现的次数；
 */
public final class MyUtil {

    // 工具类中的方法都是静态方式访问的，因此将构造器私有不允许创建对象（绝对好习惯）
    private MyUtil() {
        throw new AssertionError();
    }

    public static int countWordInFile(String filename, String word) {
        int counter = 0;
//        try ( BufferedReader br = new BufferedReader(new FileReader(filename))) {
//                String line = null;
//                while ((line = br.readLine()) != null) {
//                    int index = -1;
//                    while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
//                        counter++;
//                        line = line.substring(index + word.length());
//                    }
//                }
//        }
//        catch (Exception ex) {
//            ex.printStackTrace();
//        }

        return counter;
    }
}
