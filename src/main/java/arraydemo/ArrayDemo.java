package arraydemo;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = new int[5];
        int b[] = {1, 2, 3, 4, 5};

        double[] myList = new double[10];

        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 3;
        myList[3] = -24;
        myList[4] = 55;
        myList[5] = 6;
        myList[6] = 7;
        myList[7] = 123;
        myList[8] = 9;
        myList[9] = 10;

        System.out.println("first element of myList:" + myList[0]);
        System.out.println("first element of myList:" + myList[5]);

        System.out.println("===============================");

        for (int index = 0; index < myList.length; index++) {
            System.out.println(myList[index]);
        }

        System.out.println("==============for-each loop=============");

        for (Double item : myList) {
            System.out.println(item);
        }


        double sum = 0;

        for (Double item : myList) {
            sum += item;
        }
        System.out.println("sum:" + sum);


        double max = myList[0];
        for (int index = 1; index < myList.length; index++) {
            if (myList[index] > max) {
                max = myList[index];
            }
        }
        System.out.println("max:" + max);


        int arr1[] = {0, 1, 2, 3, 4, 5};
        int arr2[] = {5, 10, 20, 30, 40, 50};
        int arr3[] = new int[arr1.length];

        // copies an array from the specified source array
        System.arraycopy(arr1, 0, arr2, 0, 1);
        System.out.print("array2 = ");
        System.out.print(arr2[0] + " ");
        System.out.print(arr2[1] + " ");
        System.out.print(arr2[2] + " ");
        System.out.print(arr2[3] + " ");
        System.out.print(arr2[4] + " ");
        System.out.print(arr2[5] + " ");

        System.out.println();

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        for (int item : arr3) {
            System.out.print(item + " ");
        }

        int arr4[] = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr4[i] = arr1[i];
        }
        System.out.println();

        for (int item : arr4) {
            System.out.print("arr4:" + item + " ");
        }


        int arr5[] = arr1.clone();
        System.out.println();
        for (int item : arr5) {
            System.out.print(item + " ");
        }
        System.out.println();

        showArrayElement(arr1);


        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};


        answers[0][2] = 'D';

        for (int r = 0; r < answers.length; r++) {
            for (int c = 0; c < answers[r].length; c++) {
                System.out.print(answers[r][c] + " ");
            }
            System.out.println();
        }


    }


    public static void showArrayElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
