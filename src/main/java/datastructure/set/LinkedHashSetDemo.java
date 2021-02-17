package datastructure.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> hashset = new LinkedHashSet();
        hashset.add("one");
        hashset.add("two");
        hashset.add("three");

        hashset.add("four");
        hashset.add("five");
        hashset.add("six");

        System.out.println(hashset);

    }
}
