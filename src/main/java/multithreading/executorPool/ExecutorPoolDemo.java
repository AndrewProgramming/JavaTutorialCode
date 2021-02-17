package multithreading.executorPool;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorPoolDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new PrintNumber());
        executorService.execute(new PrintNumber());
        executorService.execute(new PrintNumber());

        executorService.execute(new PrintNumber());
        executorService.execute(new PrintNumber());
        executorService.execute(new PrintNumber());
        executorService.execute(new PrintNumber());

        executorService.shutdown();

        System.out.println("Is shutdown?" + executorService.isShutdown());

        while (!executorService.isTerminated()) {
            System.out.println("Not terminated!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


//        executorService.execute(new PrintNumber());


    }
}

class PrintNumber implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName() + (int) (Math.random() * 100);
        System.out.println(threadName + ":" + Math.random());
        try {
            Thread.sleep((int) (Math.random() * 20000));
            System.out.println(threadName + " finished!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
