package basic;

import java.util.Scanner;

public class FahrenheitToCelsius {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a degree in Fahrenheit:");
    double fahrenheit = input.nextDouble();
    double celsius = celsius = (5.0 / 9) * (fahrenheit - 32);

    System.out.println("celsius:" + celsius);

  }

}
