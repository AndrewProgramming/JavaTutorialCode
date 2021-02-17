package datastructure;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CountOcucurenceOfWords {
    public static void main(String[] args) {
        String text = "I love java programing because java programming is interesting!";
        Map<String, Integer> map = new TreeMap<>();

        String words[] = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();


            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key);
                    value += 1;
                    map.put(key, value);
                }
            }
        }

        System.out.println(map);


    }


}



