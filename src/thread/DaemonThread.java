package thread;

/**
 * Created by Alexhu on 2017/8/23.
 * 后台线程 Daemon Thread
 */
public class DaemonThread extends Thread {

    // 定义后台线程的线程执行体与普通线程没有任何区别
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "  " + i);
        }
    }

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();

        // 将此线程设置成后台线程
        daemonThread.setDaemon(true);

        // 启动后台线程
        daemonThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()
                + "  " + i);
        }

        // 程序执行到此处，main线程 结束
        // 后台线程也会随之结束
    }
}
