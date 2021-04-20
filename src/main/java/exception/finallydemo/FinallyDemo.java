package exception.finallydemo;

public class FinallyDemo {

  public static void main(String[] args) {
    try {
      System.out.println(1 / 0);
    } catch (RuntimeException ex) {
      int a = 1 / 0;
      System.out.println("----------");
      System.out.println(ex);
    } finally {
      System.out.println(
          "Finally block executed!");//this line of code will be executed no matter what happens
    }
  }
}
