package pattern.facadePattern;

/**
 * Created by Alexhu on 2017/8/16.
 */
public class Facade {

    // 定义被Facade封装的三个部门
    Payment payment;
    Cook cook;
    Waiter waiter;

    // 构造器
    public Facade() {
        this.payment = new PaymentImpl();
        this.cook = new CookImpl();
        this.waiter = new WaiterImpl();
    }

    public void serveFood() {
        // 依次调用三个部门的方法，封装成一个 serveFood()方法
        String food = payment.pay();
        food = cook.cook(food);
        waiter.serve(food);
    }
}
