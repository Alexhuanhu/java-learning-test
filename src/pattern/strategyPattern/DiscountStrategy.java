package pattern.strategyPattern;

/**
 * Created by Alexhu on 2017/8/16.
 */
public interface DiscountStrategy {

    // 定义一个用于计算打折价的方法
    double getDiscount(double originPrice);
}
