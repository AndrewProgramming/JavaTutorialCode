package datastructure.map;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> integerLink = new LinkedList<>();
        integerLink.add(5);
        integerLink.add(4);
        integerLink.add(3);
        integerLink.add(2);
        integerLink.add(1);

        System.out.println(integerLink);

        integerLink.add(2, 9);
        System.out.println(integerLink);

        integerLink.remove(0);
        System.out.println(integerLink);


    }
}
