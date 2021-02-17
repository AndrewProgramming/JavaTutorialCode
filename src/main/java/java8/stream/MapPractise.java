package java8.stream;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a map of the type Map<String, Double>, write an expression that returns the sum of all the
 * values in map. For example, if the map contains {"john", 1.5} and {"Peter", 1.1}, the sum is
 * 2.6.
 */
public class MapPractise {

  public static void main(String[] args) {
    Map<String, Double> map = new HashMap<>();
    map.put("john", 1.5);
    map.put("Peter", 1.1);
    map.put("Kobe", 2.4);

    System.out.println(map.entrySet().stream().mapToDouble(e -> e.getValue()).sum());

  }

}
