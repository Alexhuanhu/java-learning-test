package thread;

/**
 * Created by Alexhu on 2017/8/24.
 */
public class DrawThread extends Thread {

    //
    private Account account;

    //
    private double drawAmount;

    public DrawThread(String name, Account account, double drawAmount) {
        super(name);

        this.account = account;
        this.drawAmount = drawAmount;
    }

    //
    public void run() {
        // 不使用 synchronized 进行同步监控，会导致 多个线程同时访问一个 共享资源，以致于出现不合理的结果


        // 使用 synchronized 进行加锁操作，可以保证在一个线程访问资源期间，其他线程无法对资源进行访问
//        synchronized (account) {
//            if (account.getBalance() >= drawAmount) {
//                //
//                System.out.println(getName() + "取钱成功！吐出钞票：" + drawAmount);
//
//                try {
//                    Thread.sleep(1);
//                }
//                catch (InterruptedException ex) {
//                    ex.printStackTrace();
//                }
//
//                //
//                account.setBalance(account.getBalance() - drawAmount);
//                System.out.println("\t余额为：" + account.getBalance());
//            }
//            else {
//                System.out.println(getName() + "取钱失败！账户余额不足");
//            }
//        }

        account.draw(drawAmount);
    }
}
