package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaDemo {

  public static void main(String[] args) {
    // Creating an empty HashMap
    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

    // Mapping string values to int keys
    hash_map.put(10, "Geeks");
    hash_map.put(15, "4");
    hash_map.put(20, "Geeks");
    hash_map.put(25, "Welcomes");
    hash_map.put(30, "You");

    for (Map.Entry<Integer, String> entry : hash_map.entrySet()) {

      System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

    }

    System.out.println("=================================================");

    hash_map.forEach((k, v) -> {
      System.out.println(k + ":" + v);
    });

    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println("=================================================");

    list.forEach((item) -> {
      System.out.println(item);
    });
  }


}
