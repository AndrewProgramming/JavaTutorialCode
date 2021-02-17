package onedimensionalarray;

public class CommanLineArgsDemoB {

  public static void main(String[] args) {
    // args = new String[0]  args != null
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }

}
