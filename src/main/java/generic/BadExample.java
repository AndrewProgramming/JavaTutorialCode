package generic;

import java.util.ArrayList;

public class BadExample {

    public static void main(String[] args) {
        ArrayList noGenericList = new ArrayList();
        //This ArrayList is supposed to contain String item but infact we add Integer to it
        // which leads to error in Runntime
        noGenericList.add("Andrew Programming");
        noGenericList.add(1);

        for (int i = 0; i < noGenericList.size(); i++) {
            //We want to convent the item in the list to uppercase but there is a Integer in it which will lead error
            String arrayItem = (String) noGenericList.get(i);
            arrayItem.toUpperCase();
        }

    }
}

