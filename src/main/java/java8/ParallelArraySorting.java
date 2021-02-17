package java8;

import java.util.Arrays;

public class ParallelArraySorting {
    public static void main(String[] args) {
        // Creating an integer array   
        int[] arr = {5, 8, 1, 0, 6, 9};
        // Iterating array elements  
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // Sorting array elements parallel  
//        Arrays.parallelSort(arr);
        Arrays.parallelSort(arr,1,3);
        System.out.println("\nArray elements after sorting");
        // Iterating array elements  
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}  