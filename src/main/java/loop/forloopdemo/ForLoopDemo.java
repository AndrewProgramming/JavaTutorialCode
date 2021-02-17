package loop.forloopdemo;

public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("Count is:" + i);
        }

//        for (; ; ) {
//            System.out.println("loop");
//        }

        System.out.println("--------for-each loop---------------");

        int[] a = {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println(i);
        }

    }
}
