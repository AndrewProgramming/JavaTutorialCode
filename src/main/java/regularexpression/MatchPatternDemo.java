package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPatternDemo {

  public static void main(String[] args) {
    //匹配数字
    Pattern pattern = Pattern.compile("\\d{12}", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("13068146985");

    boolean matchFound = matcher.find();
    if (matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }


    //匹配常用字符

    //匹配空格字符
    //匹配非数字
    //重复匹配

  }

}
