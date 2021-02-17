package multithreading.createNewThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(new PrintCharA());
        executorService.execute(new PrintCharB(1));

//        executorService.shutdown();

        executorService.execute(new PrintCharB(2));
        executorService.execute(new PrintCharB(3));
        executorService.execute(new PrintCharB(4));
        executorService.execute(new PrintCharB(5));
        executorService.execute(new PrintCharB(6));
        executorService.execute(new PrintCharB(7));
        executorService.execute(new PrintCharB(8));
        executorService.execute(new PrintCharB(9));

        executorService.shutdown();


    }
}

class PrintCharA implements Runnable {

    @Override
    public void run() {
        System.out.println("A");
    }
}

class PrintCharB implements Runnable {
    private int num;

    public PrintCharB(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print(num);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}







