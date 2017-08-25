package multiThreadTest;

/**
 * Created by Alexhu on 2017/8/7.
 * 模拟 100个线程同时向一个银行账户中存入1元钱，分：在没有使用同步机制和使用同步机制情况下的执行情况
 */
// 银行账户类
public class Account {

    private double balance;     // 账户余额

    /**
     * 存款
     * @param money 存入金额
     * 第一种修改方法：加上 synchronized 关键字，在银行账户的存款（deposit）方法上同步
     */
    public synchronized void deposit(double money) {
        double newBalance = balance + money;

        try {
            Thread.sleep(10);   // 模拟此业务需要一段处理时间
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        balance = newBalance;
    }

    /**
     * 获得账户余额
     * @return
     */
    public double getBalance() {
        return balance;
    }
}
