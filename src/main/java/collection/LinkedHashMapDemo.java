package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Andrew", "Deng");
        linkedHashMap.put("Kobe", "Bryant");
        linkedHashMap.put("Leborn", "James");

        System.out.println(linkedHashMap);
    }
}
