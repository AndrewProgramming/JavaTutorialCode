package exception.trycatchdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchDemo {


    public static void main(String[] args) {
        FileReader file = null;


        try {
            file = new FileReader("A.txt");
            BufferedReader fileInput = new BufferedReader(file);
            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());
            fileInput.close();
        } catch (ArithmeticException | IOException | OutOfMemoryError e) {
            e.printStackTrace();
        }


    }
}
