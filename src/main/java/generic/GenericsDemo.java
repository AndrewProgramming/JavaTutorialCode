package generic;

import java.util.ArrayList;

public class GenericsDemo {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        //This works fine because add a String
        arrayList.add("Andrew Programming");
        //This leads an error since add an integer
        // we can detect the error in compile time instead of runtime
        //arrayList.add(1);

    }
}
