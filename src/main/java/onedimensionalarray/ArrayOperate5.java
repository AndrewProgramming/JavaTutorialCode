package onedimensionalarray;

public class ArrayOperate5 {

  public static void main(String[] args) {
    double[] myList = {1, 5, 3, 4, 5, 5};

    double max = myList[0];
    int indexOfMax = 0;

    for (int i = 1; i < myList.length; i++) {
      if (myList[i] > max) {
        max = myList[i];
        indexOfMax = i;

      }
    }

    System.out.println("max = " + max + " indexOfMax = " + indexOfMax);
  }

}
