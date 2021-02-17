package methodDemo;

public class MethodDemo {

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    private int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }


    public static void main(String arg[]) {

        System.out.println(max(1, 2));

        MethodDemo methodDemo = new MethodDemo();
        System.out.println(methodDemo.min(2, 1));


    }
}
