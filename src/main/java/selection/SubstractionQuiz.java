package selection;

import java.util.Scanner;

public class SubstractionQuiz {

  public static void main(String[] args) {

    int number1 = (int) (Math.random() * 10); // d >= 0.0 && d<1.0
    int number2 = (int) (Math.random() * 10); // d >= 0.0 && d<1.0

    if (number1 < number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    System.out.print("What is " + number1 + " - " + number2 + "? ");

    Scanner input = new Scanner(System.in);
    int answer = input.nextInt();

    if (number1 - number2 == answer) {
      System.out.println("You are corrent!");
    } else {
      System.out.println("Your answer is wrong!");
      System.out.println("Corrent answer is " + (number1 - number2));
    }

  }

}
