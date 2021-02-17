package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap();

        treeMap.put(100, "Andrew");
        treeMap.put(60, "Kidd");
        treeMap.put(99, "Jordan");
        treeMap.put(95, "Kobe");


        System.out.println(treeMap);

    }
}
