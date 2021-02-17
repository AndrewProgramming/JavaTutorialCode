package loop.forloopdemo;

public class ForLoopDemo2 {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i += 2) {
      System.out.println("I love Java Programming!");
    }

    System.out.println("========================");

    for (int i = 0; i < 10; i += 2, System.out.println("i=" + i)) {
      System.out.println("I love Java Programming!");
    }

    System.out.println("========================");

    for (int i = 0; ; i += 2, System.out.println("i=" + i)) {
      System.out.println("I love Java Programming!");

      System.out.println(i);

    }


  }

}
