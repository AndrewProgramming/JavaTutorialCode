package multithreading.countdownlatchDemo;


import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Thread t1 = new Worker(1000, countDownLatch);
        Thread t2 = new Worker(2000, countDownLatch);
        Thread t3 = new Worker(3000, countDownLatch);

        t1.start();
        t2.start();
        t3.start();

        try {
            countDownLatch.await();
            System.out.println("Main thread start executing...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


class Worker extends Thread {
    private int delay;
    private CountDownLatch countDownLatch;

    public Worker(int delay, CountDownLatch latch) {
        this.delay = delay;
        this.countDownLatch = latch;
    }

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(this.delay);
            this.countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName() + " is running!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
