package basic;

public class MathOperatorDemo {

  public static void main(String[] args) {
    int a = 10, b = 5;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);

    System.out.println("=======================");

    double d1 = 35.0D, d2 = 5.0D;
    System.out.println(d1 + d2);
    System.out.println(d1 - d2);
    System.out.println(d1 * d2);
    System.out.println(d1 / d2);
    System.out.println(d1 % d2);

    System.out.println("=======================");
    System.out.println(d1 + b);
    System.out.println(d1 - b);
    System.out.println(d1 * b);
    System.out.println(d1 / b);
    System.out.println(d1 % b);

    System.out.println("=======================");

    System.out.println(-7 % 3);
    System.out.println(7 % -3);

  }

}
