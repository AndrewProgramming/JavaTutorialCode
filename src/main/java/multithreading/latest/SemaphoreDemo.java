/*
package multithreading.latest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

  private static Account account = new Account();

  public static void main(String[] args) {
    // Create a thread pool with two threads
    ExecutorService executor = Executors.newFixedThreadPool(2);
    executor.execute(new DepositTask());
    executor.execute(new WithdrawTask());
    executor.shutdown();

    System.out.println("Thread 1\t\tThread 2\t\t\t\t\t\t\t\t\tBalance");
  }

  public static class DepositTask implements Runnable {

    @Override // Keep adding an amount to the account
    public void run() {
      try { // Purposely delay it to let the withdraw method proceed
        while (true) {
          account.deposit((int) (Math.random() * 10) + 1);
          Thread.sleep(1000);
        }
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }

  public static class WithdrawTask implements Runnable {

    @Override // Keep subtracting an amount from the account
    public void run() {
      while (true) {
        account.withdraw((int) (Math.random() * 10) + 1);
      }
    }
  }

  // An inner class for account
  private static class Account {

    private static Semaphore semaphore = new Semaphore(1);

    private int balance = 0;

    public int getBalance() {
      return balance;
    }

    public void withdraw(int amount) {
      try {
        while (balance < amount) {
          System.out.println("\t\t\t\t\t\tWait for a deposit");
          newDeposit.await();
        }

        balance -= amount;
        System.out.println("\t\t\t\t\t\tWithdraw " + amount +
            "\t\t\t\t\t\t\t\t\t" + getBalance());
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      } finally {
        lock.unlock(); // Release the lock
      }
    }


    public void deposit(int amount) {
      try {
        semaphore.acquire();
        int newBalance = balance + amount;
        Thread.sleep(5);
        balance = newBalance;
        System.out.println("Deposit " + amount +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getBalance());

        // Signal thread waiting on the condition
      } catch (InterruptedException ex) {

      } finally {
        semaphore.release();
      }
    }
  }
}*/
