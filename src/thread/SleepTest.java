package thread;

import java.util.Date;

/**
 * Created by Alexhu on 2017/8/23.
 */
public class SleepTest {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("当前时间：" + new Date());

            //
            Thread.sleep(10000);
        }
    }
}
