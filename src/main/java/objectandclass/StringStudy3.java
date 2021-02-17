package objectandclass;

public class StringStudy3 {

  public static void main(String[] args) {
    String s = "a+b$#c".replaceAll("[$+#]", "NNN");
    System.out.println(s);

    String[] tokens = "Java,C?C#,C++".split("[.,:;?]");

    for (int i = 0; i < tokens.length; i++) {
      System.out.println(tokens[i]);
    }

  }

}
