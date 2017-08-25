package pattern.strategyPattern;

/**
 * Created by Alexhu on 2017/8/16.
 * 为 DiscountStrategy打折接口提供两个策略类，分别实现不同的打折算法
 */
public class VipDiscount implements DiscountStrategy {

    // 重写getDiscount()方法，提供VIP打折算法
    public double getDiscount(double originPrice) {
        System.out.println("使用VIP折扣.....");
        return originPrice * 0.5;
    }
}
