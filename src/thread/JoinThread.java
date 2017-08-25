package thread;

/**
 * Created by Alexhu on 2017/8/23.
 *
 * join() 方法的调用
 */
public class JoinThread extends Thread {

    // 提供一个有参数的构造器，用于设置该线程的名字
    public JoinThread(String name) {
        super(name);
    }

    // 重写 run() 方法，定义线程执行体
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "  " + i);
        }
    }

    public static void main(String[] args) throws Exception {
        // 启动子线程，该线程启动以后，直到死亡以前，都会一直直线该线程，而且是和 "被join的线程"并行执行
        // 因此 控制台可以看到 i 也会到 99
        new JoinThread("新线程").start();

        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                JoinThread joinThread = new JoinThread("被join的线程");
                joinThread.start();

                // main线程调用了 joinThread线程的 join() 方法，
                // main线程必须等到 joinThread 执行结束才会向下执行
                joinThread.join();
            }

            System.out.println(Thread.currentThread().getName()
                + "  " + i);
        }
    }
}
