package methodDemo;

public class MethodOverloadingDemo {
    private int sumTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    private float sumTwoNumbers(float num1, float num2) {
        return num1 + num2;
    }

    private int sumTwoNumbers(int num1, int num3, int num2) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo methodOverloadingDemo = new MethodOverloadingDemo();

        int r1 = methodOverloadingDemo.sumTwoNumbers(1, 1);
        float f1 = methodOverloadingDemo.sumTwoNumbers(2.0f, 2.0f);
        int r2 = methodOverloadingDemo.sumTwoNumbers(1, 2, 3);

        System.out.println("r1=" + r1);
        System.out.println("f1=" + f1);
        System.out.println("r2=" + r2);

    }


}
