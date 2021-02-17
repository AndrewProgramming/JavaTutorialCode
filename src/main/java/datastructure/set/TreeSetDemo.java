package datastructure.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet();
        set.add("London");
        set.add("Paris");
        set.add("Beijing");

        Set s1=((TreeSet<String>) set).descendingSet();


        System.out.println(s1);

    }
}


