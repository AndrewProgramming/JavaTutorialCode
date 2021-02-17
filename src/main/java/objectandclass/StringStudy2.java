package objectandclass;

import java.util.Arrays;

public class StringStudy2 {

  public static void main(String[] args) {

    String a = "Welcome";

    System.out.println(a.replace('e', 'E'));

    System.out.println(a.replaceFirst("e", "E"));

    System.out.println(a.replaceAll("e", "E"));

    String b = "Java#is#great!";
    String[] result = b.split("#");

    System.out.println(Arrays.toString(result));


  }
}
