package methodDemo;

public class MethodDemoA {


    public static int returnTwoIntMax(int num1, int num2) {
        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }


    private int min(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    protected void helloMethod(String message) {
        System.out.println(message);
    }

    public static void main(String arg[]) {
        int r1 = MethodDemoA.returnTwoIntMax(2, 3);
        System.out.println("r1=" + r1);

        MethodDemoA methodDemoA = new MethodDemoA();
        methodDemoA.helloMethod("Hi Method");

        int r2 = methodDemoA.min(45, 99);
        System.out.println("r2=" + r2);

    }
}
