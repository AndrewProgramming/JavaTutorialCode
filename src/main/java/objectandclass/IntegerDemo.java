package objectandclass;

public class IntegerDemo {

  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    System.out.println(new Integer(10).compareTo(new Integer(11)));
    System.out.println(new Integer(10).compareTo(new Integer(10)));
    System.out.println(new Integer(10).compareTo(new Integer(9)));

    Integer o1 = Integer.valueOf("12");
    System.out.println(o1 == 12);

    System.out.println("==============");
    System.out.println(Integer.parseInt("11"));

    System.out.println(Integer.parseInt("11", 2));//3
    System.out.println(Integer.parseInt("11", 8));
    System.out.println(Integer.parseInt("13", 10));
    System.out.println(Integer.parseInt("1A", 16)); //26


  }
}
