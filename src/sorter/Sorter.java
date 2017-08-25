package sorter;

import java.util.Comparator;

/**
 * Created by Alexhu on 2017/8/8.
 * 排序器接口(策略模式：将算法封装到具有共同接口的独立的类中，使得它们可以相互替换)
 */
public interface Sorter {
    /**
     * 排序
     * @param list 待排序数组
     * @param <T>
     */
    public <T extends Comparable<T>> void sort(T[] list);

    /**
     * 排序
     * @param list  待排序数组
     * @param comp  比较两个对象的比较器
     * @param <T>
     */
    public <T> void sort(T[] list, Comparator<T> comp);
}
