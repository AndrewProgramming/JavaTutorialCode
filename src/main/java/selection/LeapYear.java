package selection;

import java.util.Scanner;

/**
 * 如果某年可以被 4 整除而不能被 100 整除，或者可以被 400 整除，那么这一年就是闰年
 */
public class LeapYear {

  public static void main(String args[]) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    // Check if the year is a leap year 
    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    // Display the result in a message dialog box
    System.out.println(year + " is a leap year? " + isLeapYear);
  }
}
