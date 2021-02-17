package basic;

import java.util.Scanner;

public class ReadFromKeyboard {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    byte byteValue = input.nextByte();
    System.out.println("You type:" + byteValue);


    int intValue = input.nextInt();
    System.out.println("You type:" + intValue);


  }

}
