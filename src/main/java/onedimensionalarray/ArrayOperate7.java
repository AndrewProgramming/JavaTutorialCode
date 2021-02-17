package onedimensionalarray;

public class ArrayOperate7 {

  public static void main(String[] args) {
    double[] myList = {1, 2, 3, 4, 5};
    double temp = myList[0];

    for (int i = 1; i < myList.length; i++) {
      myList[i - 1] = myList[i];
    }
    myList[myList.length - 1] = temp;

    for (int i = 0; i < myList.length; i++) {
      System.out.print(myList[i] + " ");
    }

    System.out.println();

    for (double e : myList) {
      System.out.println(e);
    }


  }

}
