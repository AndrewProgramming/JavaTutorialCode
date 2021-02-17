package multithreading.threadCorporation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCorporationDemo {

    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            executorService.execute(new AddMoney());
        }


        executorService.shutdown();

        //waiting for all the thread to shutdown
        while (!executorService.isTerminated()) {

        }

        System.out.println(account.balance);

    }

    private static class Account {
        private int balance = 0;


        public void deposit(int amount) {
            synchronized (this) {
                try {
                    int newBalance = balance + amount;

                    Thread.sleep(5);
                    balance = newBalance;

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class AddMoney implements Runnable {

        @Override
        public void run() {
            account.deposit(1);

        }
    }


}

