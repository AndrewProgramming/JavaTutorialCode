package exception.multipletrycatch;


public class MultipleTryCatchDemo {

    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            int c = a / b;
        } catch (ArrayIndexOutOfBoundsException | OutOfMemoryError e) {
            System.out.println(e);
        }
    }
}


