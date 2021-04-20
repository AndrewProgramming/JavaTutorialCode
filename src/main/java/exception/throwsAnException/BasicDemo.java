package exception.throwsAnException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class BasicDemo {

  public static void main(String[] args)  {
    BasicDemo basicDemo = new BasicDemo();
    try {
      basicDemo.myMethod();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  public void myMethod() throws IllegalAccessException {
    throw new IllegalAccessException("String");
  }

}
