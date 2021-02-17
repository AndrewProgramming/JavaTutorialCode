package datastructure.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String>  hashset = new HashSet<>();
        hashset.add("one");
        hashset.add("two");
        hashset.add("three");

        hashset.add("one");

        System.out.println(hashset);

        hashset.remove("one");
        System.out.println(hashset);

        System.out.println(hashset.contains("two1"));

        Set<String> hashset2 = new HashSet<>();
        hashset2.add("three");
        hashset2.add("four");
        hashset2.add("five");

        hashset.removeAll(hashset2);
        System.out.println(hashset);

        hashset.addAll(hashset2);
        System.out.println(hashset);

        hashset.retainAll(hashset2);
        System.out.println(hashset);




    }
}
