package character;

public class StringDemo6 {

  public static void main(String[] args) {
    String a = "123";
    int a1 = Integer.parseInt(a);
    System.out.println(a1 + 1);

    String b = "123.45";
    double b1 = Double.parseDouble(b);
    System.out.println(b1 + 1.0);

    String c = 1 + "";
    System.out.println(c);
  }

}
