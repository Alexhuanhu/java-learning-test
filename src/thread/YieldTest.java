package thread;

/**
 * Created by Alexhu on 2017/8/24.
 */
public class YieldTest extends Thread {

    public YieldTest(String name) {
        super(name);
    }

    //
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName() + "  " + i);

            //
            if (i == 20) {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //
        YieldTest yieldTestOne = new YieldTest("高级");

        //
        yieldTestOne.setPriority(Thread.MAX_PRIORITY);
        yieldTestOne.start();

        YieldTest yieldTestTwo = new YieldTest("低级");

        //
        yieldTestTwo.setPriority(Thread.MIN_PRIORITY);
        yieldTestTwo.start();
    }
}
