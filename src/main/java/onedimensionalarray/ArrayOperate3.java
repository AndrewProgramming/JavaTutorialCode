package onedimensionalarray;

public class ArrayOperate3 {

  public static void main(String[] args) {
    double myList[] = new double[10];

    for (int i = 0; i < myList.length; i++) {
      myList[i] = Math.random() * 100;
    }

    double total = 0;
    for (int i = 0; i < myList.length; i++) {
      total += myList[i];
    }

    System.out.println("total:" + total);


  }

}
