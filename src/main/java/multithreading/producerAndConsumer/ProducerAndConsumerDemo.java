package multithreading.producerAndConsumer;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerAndConsumerDemo {

    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new ProducerTask());
        executorService.execute(new ConsumerTask());

        executorService.shutdown();

        while (!executorService.isTerminated()) {

        }
    }

    private static class Account {
        private ArrayList<Integer> arrayList = new ArrayList<>();
        private static Lock lock = new ReentrantLock();
        private static Condition notEmpty = lock.newCondition();
        private static Condition notFull = lock.newCondition();


        public void produce() {
            lock.lock();
            try {
                while (arrayList.size() == 1) {
                    System.out.println("Wait for notFull condition");
                    notFull.await();
                }
                System.out.println("\t\t\t\t\t\t\t\t produce 1");
                arrayList.add(1);
                notEmpty.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }

        public void consume() {
            lock.lock();
            try {
                while (arrayList.size() == 0) {
                    System.out.println("Wait for notEmpty condition");
                    notEmpty.await();
                }
                System.out.println("\t\t\t\t\t\t\t\t consume 1");
                arrayList.clear();
                notFull.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

    }

    private static class ProducerTask implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    account.produce();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private static class ConsumerTask implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    account.consume();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
