package arraydemo;

public class CopyAnArray {
    public static void main(String[] args) {

        int a[] = {1, 3, 5, 7, 8};
        int b[];
        b = copyAnArray(a);
        for (int item : b) {
            System.out.println(item);
        }

        System.out.println("-------------------------");

        int[] c = a.clone();
        for (int item : c) {
            System.out.println(item);
        }    }

    public static int[] copyAnArray(int src[]) {
        int des[] = new int[src.length];
        for (int i = 0; i < src.length; i++) {
            des[i] = src[i];
        }
        return des;
    }
}
