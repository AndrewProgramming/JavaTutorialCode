package exception.uncheckedexception;

public class UncheckedExceptionDemo {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c = a / b;
        System.out.printf("c=" + c);//this line of code will throw an Runtime Exception
    }

}
