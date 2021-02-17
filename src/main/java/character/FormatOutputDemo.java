package character;

public class FormatOutputDemo {

  public static void main(String[] args) {
    double amount = 12618.98;
    double interestRate = 0.0013;
    double interest = amount * interestRate;
//    System.out.println("Interest is $" + (int) (interest * 100) / 100.0);
    System.out.printf("Interest is $%4.2f", interest);
    System.out.println();
    System.out.printf("%3d#%2s#%4.2f\n", 1234, "Java", 51.6653);

    System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63);
    System.out.printf("%-8d%-8s%-8.1f\n", 1234, "Java", 5.63);


  }

}
