package recursive;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ComputeFibonacci {

  /**
   * Main method
   */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an index for a Fibonacci number: ");
    int index = input.nextInt();

    // Find and display the Fibonacci number
    System.out.println("The Fibonacci number at index "
        + index + " is " + fib(index));
  }

  private static Map map = new HashMap<>();

  /**
   * The method for finding the Fibonacci number
   */
  public static long fib(long index) {
    if (map.containsKey(index)) {
      return (long) map.get(index);
    }
    if (index == 0) // Base case
    {
      return 0;
    } else if (index == 1) // Base case
    {
      return 1;
    } else  // Reduction and recursive calls
    {

      long result = fib(index - 1) + fib(index - 2);
      map.put(index, result);
      return result;
    }
  }
}