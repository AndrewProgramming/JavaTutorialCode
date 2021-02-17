package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        //create a new map
        Map<String, String> hashMap = new HashMap<>();
        //add three elements
        hashMap.put("Andrew", "Deng");
        hashMap.put("Kobe", "Bryant");
        hashMap.put("Leborn", "James");

        System.out.println(hashMap);

        //remove an element
        hashMap.remove("Andrew");

        System.out.println(hashMap);

        //check if map is empty
        System.out.println("hashmap is empty? " + hashMap.isEmpty());

        //check if map contains key Kobe
        System.out.println("contains key Kobe? " + hashMap.containsKey("Kobe"));

        //check if map contains value Bryant
        System.out.println("contains value Bryant? " + hashMap.containsValue("Bryant"));

        //traversing the map
        System.out.println("------start traversing the map------");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
