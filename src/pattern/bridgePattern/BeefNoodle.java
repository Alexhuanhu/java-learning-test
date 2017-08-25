package pattern.bridgePattern;

/**
 * Created by Alexhu on 2017/8/16.
 */
public class BeefNoodle extends AbstractNoodle {

    public BeefNoodle(Peppery style) {
        super(style);
    }

    //
    public void eat() {
        System.out.println("这是一碗美味的牛肉面条。"
            + super.style.style());
    }
}
