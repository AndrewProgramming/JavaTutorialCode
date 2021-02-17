package objectandclass;

public class StringStudy5 {

  public static void main(String[] args) {
    int a = 1;
    String b = String.valueOf(a);
    System.out.println(b);
    System.out.println(b instanceof String);

    String c = a + "";
    System.out.println(c instanceof String);

    String d = String.valueOf('a');
    System.out.println(d);
    System.out.println(d instanceof String);

    String e = String.valueOf(true);
    System.out.println(e instanceof String);
    System.out.println(e);
  }

}
