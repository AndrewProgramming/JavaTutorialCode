package onedimensionalarray;

public class ArrayOperate6 {

  public static void main(String[] args) {
    double[] myList = {1, 2, 3, 4, 5};

    for (int i = 0; i < myList.length; i++) {
      int j = (int) (Math.random() * (myList.length));

      double temp = myList[i];
      myList[i] = myList[j];
      myList[j] = temp;
    }

    for (int i = 0; i < myList.length; i++) {
      System.out.print(myList[i] + " ");
    }
  }

}
