package multithreading.latest;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FailFastIteratorExample {

  public static void main(String[] args) {
    Set hashSet = Collections.synchronizedSet(new HashSet());
    hashSet.add(1);
    hashSet.add(2);
    synchronized (hashSet) { // Must synchronize it
      Iterator iterator = hashSet.iterator();
      while (iterator.hasNext()) {
        System.out.println(iterator.next());
        //hashSet.add(3);
      }
    }
  }
}