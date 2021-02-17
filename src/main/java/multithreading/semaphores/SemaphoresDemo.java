package multithreading.semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoresDemo {

    private static Account account = new Account();


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            executorService.execute(new DepositTask());

        }

        executorService.shutdown();

        while (!executorService.isTerminated()) {

        }
        System.out.println(account.balance);

    }

    public static class DepositTask implements Runnable {

        @Override
        public void run() {
            account.deposit();
        }
    }

    private static class Account {
        private int balance = 0;
        private Semaphore semaphores = new Semaphore(1);

        public void deposit() {
            try {
                semaphores.acquire();
                int newBalacne = balance + 1;
                Thread.sleep(5);
                balance = newBalacne;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphores.release();
            }
        }
    }
}
