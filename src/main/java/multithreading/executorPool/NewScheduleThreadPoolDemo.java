package multithreading.executorPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewScheduleThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newScheduledThreadPool(1);
        ((ScheduledExecutorService) executorService).scheduleAtFixedRate(new TaskGetNum(), 1, 3, TimeUnit.SECONDS);
    }


    static class TaskGetNum implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "-" + (int) (Math.random() * 100) + ":" + (int) (Math.random() * 100));

        }
    }
}





