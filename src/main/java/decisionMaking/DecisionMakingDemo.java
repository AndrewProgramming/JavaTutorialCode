package decisionMaking;

public class DecisionMakingDemo {

    public static void showIf() {
        int a = 10;
        int b = 20;
        if (a < b) {
            System.out.println("a is less than b!");
        }

        if (true) {
            System.out.println("always true!");
        }
    }


    public static void showIfElse() {
        int a = 20;
        int b = 100;
        if (a < b) {
            System.out.println("a is less than b!");
        } else {
            System.out.println("a is greater than b!");
        }
    }


    public static void showIfElseIf() {
        int a = -10;
        int b = -10;
        if (a < b) {
            System.out.println("a is less than b");
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else if (a < 0) {
            System.out.println("a is less than 0");
        }
    }


    public static void showNestedIf() {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a == 10) {
            if (a < b) {
                System.out.println("a<b is true");
                if (c == 30) {
                    System.out.println("c==30 is true!");
                }
            } else {
                System.out.println("a<b is false");
            }
        }
    }


    public static void main(String[] args) {
//        showIf();
//        showIfElse();
//        showIfElseIf();
        showNestedIf();
    }

}
