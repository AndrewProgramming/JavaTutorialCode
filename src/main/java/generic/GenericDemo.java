package generic;

import java.util.ArrayList;

public class GenericDemo {

  public static void main(String[] args) {

    ArrayList<String> arrayList = new ArrayList();

//    arrayList.add(1);
    arrayList.add("Andrew");
    arrayList.add("Programming");

    for (int i = 0; i < arrayList.size(); i++) {
      String item = arrayList.get(i);
      System.out.println(item.length());
    }

    System.out.println("===============");

    for (String item:arrayList){
      System.out.println(item.length());
    }


  }

}
