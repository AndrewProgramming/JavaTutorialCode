package onedimensionalarray;

public class ArrayOperate1 {

  public static void main(String[] args) {
    double myList[] = new double[10];

    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter " + myList.length + " values: ");
    for (int i = 0; i < myList.length; i++) {
      myList[i] = input.nextDouble();
    }

    for (int i = 0; i < myList.length; i++) {
      System.out.print(myList[i] + " ");
    }


  }
}
