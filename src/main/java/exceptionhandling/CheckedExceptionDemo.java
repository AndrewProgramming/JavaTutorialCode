package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {

  public static void main(String[] args) throws FileNotFoundException {

    //免检异常 checked exception
    //必检异常 unchecked exception
    File file = new File("E://file.txt");
    FileReader fr = new FileReader(file);


  }


}
