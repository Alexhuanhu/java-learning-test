package pattern.strategyPattern;

/**
 * Created by Alexhu on 2017/8/16.
 * 该类用于为客户端代码选择合适折扣策略，当然也允许用户自由选择折扣策略。
 */
public class DiscountContext {

    // 组合一个 DiscountStrategy 对象
    private DiscountStrategy strategy;

    // 构造器，传入一个 DiscountStrategy 对象
    public DiscountContext(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    // 根据实际所使用的 DiscountStrategy 对象得到折扣价
    public double getDiscountPrice(double price) {
        // 如果 strategy 为空，系统自动选择 OldDiscount类
        if (strategy == null) {
            strategy = new OldDiscount();
        }

        return this.strategy.getDiscount(price);
    }

    // 提供切换算法的方法
    public void changeDiscount(DiscountStrategy strategy) {
        this.strategy = strategy;
    }
}
