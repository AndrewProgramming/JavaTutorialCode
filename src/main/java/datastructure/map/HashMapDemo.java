package datastructure.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        //小明 -> 20000  key/value
        Map<String, Integer> incomeMap = new HashMap<>();
        incomeMap.put("小明", 20000);
        incomeMap.put("小王", 30000);

        System.out.println(incomeMap.get("小明"));
        System.out.println(incomeMap.get("小王"));

        System.out.println("++++++++++++++++++++++++++++++++++");

        for (Map.Entry<String, Integer> entry : incomeMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }

        System.out.println("+++++++++++++++lambda way+++++++++++++++");
        //lambda expression
        incomeMap.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });


        System.out.println("+++++++++++++++++++Iterator++++++++++++++++++");

        Set set = incomeMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        incomeMap.put("小明",25000);
        System.out.println(incomeMap);

        incomeMap.remove("小明");
        System.out.println(incomeMap);
        incomeMap.remove("小王",30000);
        System.out.println(incomeMap);





    }
}
