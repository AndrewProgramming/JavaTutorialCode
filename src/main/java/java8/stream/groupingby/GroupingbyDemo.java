package java8.stream.groupingby;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingbyDemo {

  public static void main(String[] args) {
    String[] names = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Steve",
        "john"};
    Map<Character, Long> map = Stream.of(names)
        .collect(Collectors.groupingBy(e -> e.charAt(0), Collectors.counting()));

    System.out.println(map);

    Map<Character, Long> map1 = Stream.of(names)
        .collect(Collectors.groupingBy(e -> e.charAt(0), TreeMap::new, Collectors.counting()));
    System.out.println(map1);

  }
}
