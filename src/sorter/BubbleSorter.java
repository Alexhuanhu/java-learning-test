package sorter;

import java.util.Comparator;

/**
 * Created by Alexhu on 2017/8/8.
 * 冒泡排序
 *
 * 1.Java中的length属性是针对数组说的，比如声明了一个数组，想知道数组的长度，则用length属性；
 * 2.Java中的length()方法是针对字符串String说的，如果想看这个字符串的长度，则用length()方法；
 * 3.Java中的size()方法是针对泛型集合说的，如果想看这个泛型有多少个元素，就调用该方法；
 */
public class BubbleSorter implements Sorter {

    @Override
    public <T extends Comparable<T>> void sort(T[] list) {
        boolean swapped = true;
        for (int i = 1, len = list.length; i < len && swapped; ++i) {
            swapped = false;
            for (int j = 0; j < len - i; ++j) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    @Override
    public <T> void sort(T[] list, Comparator<T> comp) {
        boolean swapped = true;
        for (int i = 1, len = list.length; i < len && swapped; ++i) {
            swapped = false;
            for (int j = 0; j < len - i; ++j) {
                if (comp.compare(list[j], list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] inputArray = {5, 9, 2, 18, 1, 0, 4, 8, 3};
//        List inputList = Arrays.asList(inputArray);

        BubbleSorter bubbleSorter = new BubbleSorter();
        bubbleSorter.sort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }
}
