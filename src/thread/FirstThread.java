package thread;

/**
 * Created by Alexhu on 2017/8/23.
 * 通过继承 Thread 类，来创建线程类
 *
 * 跑这个程序时，有 3 个线程：主线程，线程1，线程2
 * 3 个线程的执行顺序是随机的，因此每次执行的结果都不同
 */
public class FirstThread extends Thread {

    // 此处的 i 定义在 for循环的内部或者外部，没有区别，Thread-1 和 Thread-2 都是从 0 到 99
    private int i;

    // 重写 run() 方法，run() 方法的方法体就是线程执行体
    public void run() {
        for ( ; i < 100; i++) {
            // 当线程类继承 Thread类时，直接使用this即可获取当前线程
            // Thread对象的getName()返回当前线程的名字
            // 因此可以直接调用 getName() 方法返回当前线程的名字
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            // 调用 Thread 的 currentThread() 方法获取当前线程
            System.out.println(Thread.currentThread().getName()
                + " " + i);
            if (i == 20) {
                // 创建并启动第一个线程
                new FirstThread().start();

                // 创建并启动第二个线程
                new FirstThread().start();
            }
        }
    }
}
