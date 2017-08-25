public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        Short s1 = 1;
//        s1 = s1 + 1;  // 会报错，因为 s1 + 1，执行以后是  int型，不能赋给 short型
        s1 = (short) (s1 + 1);
        System.out.println(s1);

    }
}
