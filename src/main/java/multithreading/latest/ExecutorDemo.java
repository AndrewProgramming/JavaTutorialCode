package multithreading.latest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

  public static void main(String[] args) {
    // Create a fixed thread pool with maximum three threads
    ExecutorService executor = Executors.newCachedThreadPool();

    // Submit runnable tasks to the executor
    executor.execute(new PrintChar('a', 100));
    executor.execute(new PrintChar('b', 100));
    executor.execute(new PrintNum(100));

    System.out.println("is shutdown:"+executor.isShutdown());
    // Shut down the executor
    executor.shutdown();
    System.out.println("is shutdown:"+executor.isShutdown());

    System.out.println("is terminated:"+executor.isTerminated());

    while (!executor.isTerminated()){

    }
    System.out.println("is terminated:"+executor.isTerminated());




  }
}