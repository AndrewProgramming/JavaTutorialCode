package LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");

        linkedList.add(2, "f");

        linkedList.remove();
        linkedList.remove("f");
        linkedList.remove(0);

        System.out.println(linkedList);

        System.out.println(linkedList.size());

        System.out.println(linkedList.get(1));

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println("----------basic for loop-------------");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("---------- for each loop-------------");


        for (String item : linkedList) {
            System.out.println(item);
        }

        System.out.println("-------iterator------");
        Iterator<String> itr = linkedList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        System.out.println(linkedList.contains("c"));
        System.out.println(linkedList.contains("f"));

        linkedList.clear();

        System.out.println(linkedList.size());

    }
}
