package java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> str = new ArrayList<>();
        for (String item : strings) {
            if (item.equals("")) {
                continue;
            } else {
                str.add(item);
            }

        }
        System.out.println(str);
        //filter

        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        //map
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squareList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(squareList);


        //limit
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        System.out.println("====sorted======");
        //sorted
        Random random1 = new Random();
        random1.ints().limit(10).sorted().forEach(System.out::println);

        System.out.println("=======filteredParallel========");
        //filteredParallel
        List<String> filteredParallel = strings.parallelStream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filteredParallel);


        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);


        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());
        System.out.println(stats.getSum());


    }
}
