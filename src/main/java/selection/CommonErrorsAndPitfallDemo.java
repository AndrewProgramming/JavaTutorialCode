package selection;

public class CommonErrorsAndPitfallDemo {

  public static void main(String[] args) {
    double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
    System.out.println(x);
    System.out.println(x == 0.5);
    //epsilon

    final double EPSILON = 1E-14;
    if (Math.abs(x - 0.5) < EPSILON) {
      System.out.println("true");
    }
  }

}
