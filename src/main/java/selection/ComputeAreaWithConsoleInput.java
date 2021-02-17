package selection;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a radius
    System.out.print("Enter a number for radius: ");
    double radius = input.nextDouble();

    if (radius < 0) {
      System.out.println("Enter wrong number , please retype again!");
    } else {
      // Compute area
      double area = radius * radius * 3.14159;

      // Display result
      System.out.println("The area for the circle of radius " +
          radius + " is " + area);
    }


  }
}
