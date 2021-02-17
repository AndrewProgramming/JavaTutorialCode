package database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode66_1 {
    public static void main(String[] args) {
        Leetcode66_1 ins = new Leetcode66_1();
        int a[] = {1, 2, 3};
        ins.plusOne(a);

    }

    public int[] plusOne(int[] digits) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            list1.add(digits[i]);
        }

        List<Integer> list2 = new ArrayList<Integer>(Collections.nCopies(list1.size(), 0));

        list2.set(0, 1);

        List<Integer> list3 = new ArrayList();

        int carry = 0;
        for (int i = 0; i < list1.size(); i++) {
            int v = list1.get(i) + list2.get(i) + carry;
            if (v >= 10) {
                list3.add(0);
                carry = 1;
            } else {
                list3.add(v);
                carry = 0;

            }
        }
        if (carry == 1) {
            list3.add(1);
        }

        int r1[] = new int[list3.size()];
        Collections.reverse(list3);
        for (int i = 0; i < list3.size(); i++) {
            r1[i] = list3.get(i);
        }
        return r1;

    }

}
/**
 * 执行用时 :
 * 2 ms
 * , 在所有 Java 提交中击败了
 * 8.90%
 * 的用户
 * 内存消耗 :
 * 35.7 MB
 * , 在所有 Java 提交中击败了
 * 36.83%
 * 的用户
 */
