package basic;

import java.util.Scanner;

/**
 * 计算以秒为单位的时间量所包含的分钟数和余下的秒数。例如，500 秒就 是8分钟20秒。
 */
public class DisplayTime {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Prompt the user for input
    System.out.println("Enter an integer for seconds:");
    int seconds = input.nextInt();

    int minutes = seconds / 60;
    int remainingSeconds = seconds % 60;

    System.out.println(
        seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");

  }

}
