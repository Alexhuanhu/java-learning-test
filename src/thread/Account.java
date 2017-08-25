package thread;

/**
 * Created by Alexhu on 2017/8/24.
 */
public class Account {
    //
    private String accountNo;      // 账户号
    private double balance;     // 余额

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    // 不能随便让客户修改 余额
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    //
    public int hashCode() {
        return accountNo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == Account.class) {
            Account target = (Account) obj;
            return target.getAccountNo().equals(accountNo);
        }

        return false;
    }

    /**
     * 该方法用于 取钱操作, 增加了 加锁操作，确保线程安全
     * @param drawAmount 取钱金额
     */
    public synchronized void draw(double drawAmount) {
        //
        if (balance >= drawAmount) {
            //
            System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAmount);

            try {
                Thread.sleep(1);
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            //
            balance -= drawAmount;
            System.out.println("\t余额为：" + balance);
        }
        else {
            System.out.println(Thread.currentThread().getName() + "取钱失败！账户余额不足");
        }
    }
}
