package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("myFile.txt")) {
            char a[] = new char[16];
            fr.read(a);
            for (char item : a) {
                System.out.print(item);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
