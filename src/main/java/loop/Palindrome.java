package loop;

import java.util.Scanner;

/**
 * 如果一个字符串从前往后，以及从后往前是一样的，那么它就是一个回文。例如， “ mom”、“ dad ”，以及“ noon”, 都是回文。
 * 要解决的问题是，编写一个程序，提示用户输人一个字符串，然后给出该字符串是否是 回文。
 */

public class Palindrome {

  public static void main(String[] args) {
//    Math.random();
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    // The index of the first character in the string
    int low = 0;

    // The index of the last character in the string
    int high = s.length() - 1;

    boolean isPalindrome = true;
    while (low < high) {
      if (s.charAt(low) != s.charAt(high)) {
        isPalindrome = false;
        break;
      }

      low++;
      high--;
    }

    if (isPalindrome) {
      System.out.println(s + " is a palindrome");
    } else {
      System.out.println(s + " is not a palindrome");
    }
  }
}
