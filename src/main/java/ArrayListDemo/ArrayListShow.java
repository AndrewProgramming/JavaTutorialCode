package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListShow {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("Andrew");

        System.out.println(arrayList);

        System.out.println(arrayList.size());

        arrayList.remove("Andrew");

        System.out.println(arrayList.size());

        arrayList.add("James");
        arrayList.add("Kobe");
        arrayList.add(1, "Jordan");

        arrayList.remove(1);


        System.out.println(arrayList);


    }
}
