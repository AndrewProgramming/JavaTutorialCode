package multithreading.executorPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new TaskGetNum());
        executorService.execute(new TaskGetNum());
        executorService.execute(new TaskGetNum());
        executorService.execute(new TaskGetNum());
        executorService.execute(new TaskGetNum());
        executorService.shutdown();
    }
}

class TaskGetNum implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-" + (int) (Math.random() * 100) + ":" + (int) (Math.random() * 100));
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
