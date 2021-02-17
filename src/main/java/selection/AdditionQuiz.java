package selection;

import java.util.Scanner;

/**
 * 假设希望开发一个程序，让一年级学生练习加法。程序随机产生两个一位整数：
 * number1 和number2, 例如显示“ What is 1 + 7?”。当学生在
 * 输入对话框中输入答案之后，程序显示一个消息，表明答案是真的还是假的。
 */
public class AdditionQuiz {

  public static void main(String[] args) {
    int number1 = (int) (System.currentTimeMillis() % 10);
    int number2 = (int) (System.currentTimeMillis() / 7 % 10);

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print("What is " + number1 + " + " + number2 + "? ");

    int answer = input.nextInt();

    System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
  }
}
