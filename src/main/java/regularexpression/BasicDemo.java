package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicDemo {

  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("Andrew", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Andrew Programming!");

    boolean matchFound = matcher.find();
    if (matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }

}
