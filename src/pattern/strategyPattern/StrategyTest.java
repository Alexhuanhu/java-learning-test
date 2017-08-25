package pattern.strategyPattern;

/**
 * Created by Alexhu on 2017/8/16.
 * 策略模式   该类用于 测试使用 Context类来处理图书打折的任何情况
 */
public class StrategyTest {

    public static void main(String[] args) {
        // 客户端没有选择打折策略类
        DiscountContext dc = new DiscountContext(null);

        double priceOne = 79;

        // 使用默认的打折策略
        System.out.println("79元的书默认打折后的价格是："
            + dc.getDiscountPrice(priceOne));

        // 客户端选择合适的VIP打折策略
        dc.changeDiscount(new VipDiscount());
        double priceTwo = 89;

        // 使用VIP打折得到打折价格
        System.out.println("89元的书对VIP用户的价格是："
            + dc.getDiscountPrice(priceTwo));
    }
}
