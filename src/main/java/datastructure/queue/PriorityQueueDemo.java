package datastructure.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

  public static void main(String[] args) {
    PriorityQueue<Integer> queue1 = new PriorityQueue<>();

    queue1.offer(3);
    queue1.offer(1);
    queue1.offer(2);

    queue1.offer(4);
    queue1.offer(5);
    queue1.offer(6);

    System.out.println(queue1);

    while (!queue1.isEmpty()) {
      System.out.print(queue1.poll() + " ");
    }

    System.out.println("===============");

    PriorityQueue<Integer> queue2 = new PriorityQueue<>(6, Collections.reverseOrder());
    queue2.offer(3);
    queue2.offer(1);
    queue2.offer(2);

    queue2.offer(4);
    queue2.offer(5);
    queue2.offer(6);

    while (!queue2.isEmpty()) {
      System.out.print(queue2.poll() + " ");
    }


  }

}
