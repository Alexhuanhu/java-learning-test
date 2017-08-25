package thread;

/**
 * Created by Alexhu on 2017/8/23.
 * 实现Runnable接口创建线程类
 * 注意：采用Runnable接口的方式创建的多个线程可以共享线程类的实例变量。
 */
public class SecondThread implements Runnable {

    // 如果 i 的定义放在for循环外面定义，那么执行以后 新线程1 和 新线程2 的 i 变量是连续的
    // 如果 i 的定义放在for循环里面定义，那么执行以后 新线程1 和 新线程2 的 i 变量是非连续的，并且都从 0 到 99
    // 原因：如果 i 在for循环外面定义，程序所创建的 Runnable对象只是线程的target，而多个线程可以共享同一个target，
    // 所以多个线程可以共享一个线程类的实例变量
    private int i;

    //
    public void run() {
        for ( ; i < 100; i++) {
            //
            System.out.println(Thread.currentThread().getName()
                + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()
                + " " + i);

            if (i == 20) {
                SecondThread secondThread = new SecondThread();
                // 通过 new Thread(target, name)方法创建新线程
                new Thread(secondThread, "新线程1").start();

                new Thread(secondThread, "新线程2").start();
            }
        }
    }
}
