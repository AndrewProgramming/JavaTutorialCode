package multidimensionalarray;

import java.util.Scanner;

public class ArrayDemo1 {

  public static void printArray(double[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    double[][] matrix = new double[2][2];

    java.util.Scanner input = new Scanner(System.in);
    System.out.println("Enter " + matrix.length + " rows and " +
        matrix[0].length + " columns: ");
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        matrix[row][column] = input.nextInt();
      }
    }

    printArray(matrix);

    int sum = 0;
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        sum += matrix[row][column];
      }
    }

    System.out.println("sum = " + sum);

    for (int column = 0; column < matrix[0].length; column++) {
      int total = 0;
      for (int row = 0; row < matrix.length; row++) {
        total += matrix[row][column];
      }
      System.out.println("Sum for column " + column + " is "
          + total);
    }

    int maxRow = 0;
    int indexOfMaxRow = 0;

    for (int column = 0; column < matrix[0].length; column++) {
      maxRow += matrix[0][column];
    }

    for (int row = 1; row < matrix.length; row++) {
      int totalOfThisRow = 0;
      for (int column = 0; column < matrix[row].length; column++) {
        totalOfThisRow += matrix[row][column];
      }

      if (totalOfThisRow > maxRow) {
        maxRow = totalOfThisRow;
        indexOfMaxRow = row;
      }
    }

    System.out.println("Row=" + indexOfMaxRow + " maxValue = " + maxRow);

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        int i1 = (int) (Math.random() * matrix.length);
        int j1 = (int) (Math.random() * matrix[i].length);
        // Swap matrix[i][j] with matrix[i1][j1]
        double temp = matrix[i][j];
        matrix[i][j] = matrix[i1][j1];
        matrix[i1][j1] = temp;
      }
    }

    printArray(matrix);

  }

}
