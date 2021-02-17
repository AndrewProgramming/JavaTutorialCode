package arraydemo;

import java.util.Arrays;

public class ArrayClassDemo {
    public static void main(String[] args) {
        int a[] = {43, 1, 55, 7, 100};
        sortingArray(a);

    }

    public static void sortingArray(int[] array) {
        Arrays.sort(array);
        for (int item : array) {
            System.out.println(item);
        }
    }
}
