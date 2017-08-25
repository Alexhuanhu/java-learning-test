package pattern.bridgePattern;

/**
 * Created by Alexhu on 2017/8/16.
 * 桥接模式  测试类
 */
public class Test {

    public static void main(String[] args) {

        // 下面将得到 "辣味" 的牛肉面
        AbstractNoodle noodleOne = new BeefNoodle(new PepperyStyle());

        noodleOne.eat();

        // 下面将得到 "不辣" 的牛肉面
        AbstractNoodle noodleTwo = new BeefNoodle(new PlainStyle());

        noodleTwo.eat();

        // 下面将得到 "辣味的" 的猪肉面
        AbstractNoodle noodleThree = new PorkyNoodle(new PepperyStyle());

        noodleThree.eat();

        // 下面将得到 "不辣" 的猪肉面
        AbstractNoodle noodleFour = new PorkyNoodle(new PlainStyle());

        noodleFour.eat();
    }
}
