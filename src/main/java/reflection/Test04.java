package reflection;

import java.lang.annotation.ElementType;

public class Test04 {

  public static void main(String[] args) {
    Class c1 = Object.class;
    Class c2 = Comparable.class;
    Class c3 = String[] .class;
    Class c4 = int[][].class;
    Class c5 = Override.class;
    Class c6 = ElementType.class;
    Class c7 = Integer.class;
    Class c8 = void.class;
    Class c9 = Class.class; //Class

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(c7);
    System.out.println(c8);
    System.out.println(c9);

  }
}
