package datastructure.performancetest;

import java.util.*;

public class PerformanceTest {
    static final int N = 50000;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        Collections.shuffle(list);


        Collection<Integer> set1 = new HashSet<>(list);

        System.out.println("******************** Hashset **************************");

        System.out.println("Member test time for hashset is " + getTestTime(set1) + " milliseconds");
        System.out.println("Remove test time for hashset is " + getRemoveTime(set1) + " milliseconds");

        //******************** LinkedHashset **************************
        Collection<Integer> linkedHashset = new LinkedHashSet<>(list);
        System.out.println("******************** LinkedHashset **************************");
        System.out.println("Member test time for linkedHashset is " + getTestTime(linkedHashset) + " milliseconds");
        System.out.println("Remove test time for linkedHashset is " + getRemoveTime(linkedHashset) + " milliseconds");


        //******************** TreeSet **************************
        Collection<Integer> treeset = new TreeSet<>(list);
        System.out.println("******************** TreeSet **************************");
        System.out.println("Member test time for TreeSet is " + getTestTime(treeset) + " milliseconds");
        System.out.println("Remove test time for TreeSet is " + getRemoveTime(treeset) + " milliseconds");


        //******************** arraylist **************************
        Collection<Integer> arraylist = new ArrayList<>(list);
        System.out.println("******************** arraylist **************************");
        System.out.println("Member test time for arraylist is " + getTestTime(arraylist) + " milliseconds");
        System.out.println("Remove test time for arraylist is " + getRemoveTime(arraylist) + " milliseconds");


        //******************** linkedlist **************************
        Collection<Integer> linkedlist = new LinkedList<>(list);
        System.out.println("******************** linkedlist **************************");
        System.out.println("Member test time for linkedlist is " + getTestTime(linkedlist) + " milliseconds");
        System.out.println("Remove test time for linkedlist is " + getRemoveTime(linkedlist) + " milliseconds");

    }


    public static long getTestTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();

        // Test if a number is in the collection
        for (int i = 0; i < N; i++) c.contains((int) (Math.random() * 2 * N));

        return System.currentTimeMillis() - startTime;
    }


    public static long getRemoveTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) c.remove(i);
        return System.currentTimeMillis() - startTime;
    }
}