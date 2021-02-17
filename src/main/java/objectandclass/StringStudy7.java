package objectandclass;

public class StringStudy7 {

  public static void main(String[] args) {

    StringBuilder sb = new StringBuilder(55);
    StringBuffer sb1 = new StringBuffer();

    sb.append("Welcome");
    sb.append(' ');
    sb.append("to");
    sb.append(' ');
    sb.append("Java");

    System.out.println(sb.toString());

    sb.insert(11,"HTML and ");

    System.out.println(sb.toString());

    sb.delete(8,11);
    System.out.println(sb.toString());

    sb.deleteCharAt(8);
    System.out.println(sb.toString());

    sb.reverse();
    System.out.println(sb.toString());


    System.out.println(sb.capacity());

    System.out.println(sb.length());

    sb.append("11111111111111111111111111111111111");

    System.out.println(sb.capacity());

    System.out.println(sb.length());


    sb.trimToSize();
    System.out.println(sb.capacity());

    System.out.println(sb.length());




  }

}
