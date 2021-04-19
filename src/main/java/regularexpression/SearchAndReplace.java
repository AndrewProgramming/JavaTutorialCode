package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchAndReplace {

  public static void main(String[] args) {
    String s = "the quick brown fox jumps over the lazy dog.";
    Pattern p = Pattern.compile("\\wo\\w");
    Matcher m = p.matcher(s);
    while (m.find()) {

      String sub = s.substring(m.start(), m.end());
      System.out.println(sub);
    }

    String s1 = "The     quick\t\t brown   fox  jumps   over the  lazy dog.";
    String r = s1.replaceAll("\\s+", " ");
    System.out.println(r); // "The quick brown fox jumps over the lazy dog."

    String s2 = "the quick brown fox jumps over the lazy dog.";
    String r1 = s2.replaceAll("\\s([a-z]{4})\\s", " <b>$1</b> ");
    System.out.println(r1);
  }
}

