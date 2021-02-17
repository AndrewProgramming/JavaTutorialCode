package basic;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(Integer.valueOf(1));

        AutoBoxingAndUnBoxing autoBoxingAndUnBoxing = new AutoBoxingAndUnBoxing();

        Integer num = new Integer(10);
        autoBoxingAndUnBoxing.unboxingDemo(10);

        Integer sum = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            sum = sum + i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);


        int sum1 = 0;
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            sum1 = sum1 + i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

    }

    public void unboxingDemo(Integer num) {
        System.out.println("num:" + num);
    }
}
