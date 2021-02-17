package character;

public class StringDemo4 {

  public static void main(String[] args) {
    String s1 = "Welcome to Java";
    String s2 = "Welcome to Java";
    String s3 = "Welcome to C++";
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1.equals(s3)); // false

    String s4 = "abc";
    String s5 = "abg";
    System.out.println(s4.compareTo(s5));
    System.out.println('c' - 'g');

    String s6 = "ABC";
    System.out.println(s4.equalsIgnoreCase(s6));

    System.out.println(s4.compareToIgnoreCase(s6));

    System.out.println(s1.startsWith("We"));
    System.out.println(s1.startsWith("we"));

    System.out.println(s1.endsWith("va"));
    System.out.println(s1.endsWith("v"));
    System.out.println(s1.endsWith("Va"));

    System.out.println(s1.contains("to"));
    System.out.println(s1.contains("To"));
  }

}
