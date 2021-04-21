package file;

import java.io.File;
import java.util.Scanner;

public class ReadData {

  public static void main(String[] args) throws Exception {
    File file = new File("scores.txt");
    Scanner input = new Scanner(file);

    while (input.hasNext()) {
      String name = input.next();
      int score = input.nextInt();
      System.out.println("name:" + name + " score:" + score);
    }

    input.close();
  }
}
