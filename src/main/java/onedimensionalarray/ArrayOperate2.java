package onedimensionalarray;

import java.util.Scanner;

public class ArrayOperate2 {

  public static void main(String[] args) {
    double myList[] = new double[10];

    for (int i = 0; i < myList.length; i++) {
      myList[i] = Math.random() * 100;
    }

    for (int i = 0; i < myList.length; i++) {
      System.out.print(myList[i] + " ");
    }
    System.out.println();
    char [] city = {'D','B','A'};
    System.out.println(city);

  }

}
