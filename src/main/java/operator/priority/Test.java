package operator.priority;

public class Test {

  public static void main(String[] args) {
    int y;
    int x = 5;
    y = x++ + ++x + x * 10;
    // 即y = 5 + 7 + 70 = 82
    System.out.println(y);
  }

  //1

  //2


}
