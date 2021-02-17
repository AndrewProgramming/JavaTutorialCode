package multithreading.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BlockingQueueDemo {
    private static BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue(1);

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new ProducerTask());
        executorService.execute(new ConsumerTask());


    }

    public static class ProducerTask implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("before produce:" + blockingQueue);
                    blockingQueue.put(1);
                    System.out.println("after produce:" + blockingQueue);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class ConsumerTask implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("before consume:" + blockingQueue);
                    blockingQueue.take();
                    System.out.println("after consume:" + blockingQueue);
                    Thread.sleep(500);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
