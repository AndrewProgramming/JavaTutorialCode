package sort;

public class SelectionSort {

  public void selectionSort(int arr[]) {
    int length = arr.length;
    int minIndex, temp;

    for (int i = 0; i < length - 1; i++) {
      minIndex = i;
      for (int j = i + 1; j < length; j++) {
        if (arr[j] < arr[minIndex]) {     // 寻找最小的数
          minIndex = j;                 // 将最小数的索引保存
        }
      }
      temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }

}
