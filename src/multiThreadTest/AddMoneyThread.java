package multiThreadTest;

/**
 * Created by Alexhu on 2017/8/7.
 * 存钱线程
 */
public class AddMoneyThread implements Runnable {

    private Account account;    // 存入账户
    private double money;       // 存入金额

    public AddMoneyThread(Account account, double money) {
        this.account = account;
        this.money = money;
    }

    /**
     * 第二种修改方法: 在线程调用存款方法时，对银行账户进行同步
     */
    @Override
    public void run() {
//        account.deposit(money);       // 未同步使用该语句

        // 同步化 使用下面的语句
        synchronized (account) {
            account.deposit(money);
        }
    }
}
