package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {

  public static void main(String[] args) {
    String[] names = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle",
        "john"};

    Stream.of(names).limit(4).sorted().forEach(e -> System.out.println(e + " "));

    System.out.println();

    Stream.of(names).skip(4).sorted((e1, e2) -> e1.compareToIgnoreCase(e2)).forEach(e -> System.out
        .println(e + " "));

    System.out.println();

    Stream.of(names).skip(4).sorted(String::compareToIgnoreCase).forEach(e -> System.out
        .println(e + " "));

    System.out.println();

    System.out.println(Stream.of(names).anyMatch(e->e.equals("Stacy")));

    System.out.println();
    System.out.println(Stream.of(names).allMatch(e->Character.isUpperCase(e.charAt(0))));

    System.out.println();
    System.out.println(Stream.of(names).noneMatch(e->e.startsWith("Ko")));

    System.out.println();
    System.out.println(Stream.of(names).map(e->e.toUpperCase()).distinct().count());

    System.out.println();
    Object[] array=Stream.of(names).map(String::toLowerCase).toArray();
    System.out.println(Arrays.toString(array));

  }

}
