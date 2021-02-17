package collection;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfWords {

    public static void main(String[] args) {
        String text = "aabbccddejflslasdkljljlkjhhkjhjghjsdfssssaa";

        Map<Character, Integer> hashMap = new HashMap();

        char arr[] = text.toCharArray();
        for (char item : arr) {
            if (hashMap.containsKey(item)) {
                int counter = hashMap.get(item);
                counter++;
                hashMap.put(item, counter);
            } else {
                int counter = 0;
                hashMap.put(item, counter);
            }
        }

        System.out.println(hashMap);
    }
}
