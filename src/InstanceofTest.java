/**
 * Created by Alexhu on 2017/8/7.
 * 结果 = 某个实例对象 instanceof 某个类名；
 * S(Object) instanceof T(Class)
 * 简单来说，instanceof 就是判断 某个对象S 是否是 某个类T的实例，或者是T类的子类实例
 */
public class InstanceofTest {

    public static void main(String[] args) {
        Object o1 = new A();
        Object o2 = new B();

        System.out.println(o1 instanceof A);
        System.out.println(o1 instanceof B);
        System.out.println(o2 instanceof A);
        System.out.println(o2 instanceof B);
    }
}

class A {

}

class B extends A {

}
