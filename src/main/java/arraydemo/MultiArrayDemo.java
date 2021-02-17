package arraydemo;

public class MultiArrayDemo {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {54, 1, 3, 6, 7}, {99, -98, -33, 23, 0}};

        int max = arr[0][0];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] > max) {
                    max = arr[r][c];
                }
            }
        }
        System.out.println("Max:" + max);
    }
}
