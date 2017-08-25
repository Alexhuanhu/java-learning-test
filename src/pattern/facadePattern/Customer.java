package pattern.facadePattern;

/**
 * Created by Alexhu on 2017/8/16.
 *
 */
public class Customer {

    // 通过调用所有部分实现的 havaDinner 方法
    public void havaDinner() {

        // 依次创建三个部门实例
        Payment payment = new PaymentImpl();
        Cook cook = new CookImpl();
        Waiter waiter = new WaiterImpl();

        // 依次调用三个部门实例的方法来实现用餐功能
        String food = payment.pay();
        food = cook.cook(food);
        waiter.serve(food);
    }

    // 通过Facade实现的 havaDinner 方法
    public void havaDinnerByFacadeClass() {
        // 直接依赖于 Facade 类来实现用餐方法
        Facade facade = new Facade();
        facade.serveFood();
    }
}
