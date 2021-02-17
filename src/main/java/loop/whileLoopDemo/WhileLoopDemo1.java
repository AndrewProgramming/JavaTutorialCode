package loop.whileLoopDemo;

public class WhileLoopDemo1 {

  public static void main(String[] args) {
    int sum = 0, i = 1;
    //差一错误
    while (i <= 10) {
      sum = sum + i;
      i++;
    }

    System.out.println("sum is: " + sum);


  }

}
