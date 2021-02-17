package datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();

    queue.offer(1);
    queue.offer(2);
    queue.add(3);

    System.out.println(queue);

    System.out.println(queue.poll());
    System.out.println(queue);

    System.out.println(queue.peek());
    System.out.println(queue);


  }
}
