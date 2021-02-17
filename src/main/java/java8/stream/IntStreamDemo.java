package java8.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {

  public static void main(String[] args) {
    int[] values = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};
    IntStream.of(values).distinct().filter(e -> e > 3 && e % 2 == 0).average().getAsDouble();

    System.out.println("The sum of the first 4 numbers is " + IntStream.of(values).limit(4).sum());

    IntSummaryStatistics stats = IntStream.of(values).summaryStatistics();
    System.out.println(stats.getMax());
    System.out.println(stats.getSum());
    System.out.println(stats.getMin());
    System.out.println(stats.getAverage());
    System.out.println(stats.getCount());

    String[] names = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle",
        "john"};

    System.out.println(Stream.of(names).mapToInt(e -> e.length()).sum());

    System.out.println("The number of digits in array values is " +
        Stream.of(values).map(e -> e + "")
            .mapToInt(e -> e.length()).sum());
  }

}
