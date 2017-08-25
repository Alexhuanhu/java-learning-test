package pattern.proxyPattern.dynamicProxyPattern;

/**
 * Created by Alexhu on 2017/8/15.
 * 该类为：一个 拦截器
 */
public class TxUtil {

    //
    public void beginTx() {
        System.out.println("===========模拟开始事务=============");
    }

    public void endTx() {
        System.out.println("============模拟结束事务============");
    }
}
