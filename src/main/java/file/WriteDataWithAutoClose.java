package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("scores.txt");
    if (file.exists()) {
      System.out.println("File already exists!");
      System.exit(0);
    }


    try(PrintWriter output = new PrintWriter(file)){
      output.print("Andrew Programming1111111");
      output.println(90);

      output.print("Eric");
      output.println(80);
    }

  }

}

