package string;

public class StringDemo1 {

  public static void main(String[] args) {
    String message = "Welcome to Java";
    System.out.println(message.length());
    int length1 = "Welcome to Java".length();
    System.out.println(length1);

    System.out.println(message.charAt(6));

    message.charAt(message.length() - 1);

    String s1 = "Java";
    String s2 = " Programming";

    String s3 = s1.concat(s2);
    System.out.println(s3);

    String s4 = s1 + s2;
    System.out.println(s4);

    String s5 = s1 + 11;

    System.out.println(s5);

    //+=
    s3 += " and Java is fun";//s3 = s3+" Java is fun"
    System.out.println(s3);

    int i = 1, j = 1;
    System.out.println("i + j is" + (i + j));

    System.out.println(message.toLowerCase());
    System.out.println(message.toUpperCase());

    String s6 = "   Java      ";
    System.out.println(s6);
    System.out.println(s6.trim());

    String s7 = "\t Good Night \n";

    System.out.println(s7);
    System.out.println(s7.trim());


  }
}
