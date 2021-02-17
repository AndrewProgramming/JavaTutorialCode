package recursive;
/**
 * • 情况1: 如果关键字比中间元素小，那么只需在前一半数组元素中进行递归査找。
 * • 情况2: 如果关键字和中间元素相等，则匹配成功，査找结束。
 * • 情况3: 如果关键字比中间元素大，那么只需在后一半数组元素中进行递归査找
 */
public class RecursiveBinarySearch {

  public static void main(String[] args) {
    int [] array = {1,2,3,4,5,6};
    System.out.println(recursiveBinarySearch(array,7));
  }

  public static int recursiveBinarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;
    return recursiveBinarySearch(list, key, low, high);
  }

  private static int recursiveBinarySearch(int[] list, int key,
      int low, int high) {
    if (low > high)  // The list has been exhausted without a match
    {
      return -low - 1;
    }

    int mid = (low + high) / 2;
    if (key < list[mid]) {
      return recursiveBinarySearch(list, key, low, mid - 1);
    } else if (key == list[mid]) {
      return mid;
    } else {
      return recursiveBinarySearch(list, key, mid + 1, high);
    }
  }
}