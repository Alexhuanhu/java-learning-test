package pattern.observerPattern;

import javax.swing.*;

/**
 * Created by Alexhu on 2017/8/16.
 */
public class NameObserver implements Observer {

    // 实现观察者必须实现的update方法
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            // 将产品名称改变值放在name中
            String name = (String) arg;

            // 启动一个JFrame窗口来显示被观察对象的状态改变
            JFrame jFrame = new JFrame("观察者");
            JLabel jLabel = new JLabel("名称改变为：" + name);
            jFrame.add(jLabel);
            jFrame.pack();
            jFrame.setVisible(true);
            System.out.println("名称观察者：" +
                o + "物品名称已经改变为：" + name);
        }
    }
}
