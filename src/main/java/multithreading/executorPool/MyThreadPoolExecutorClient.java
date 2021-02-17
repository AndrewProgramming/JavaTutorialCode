package multithreading.executorPool;

import java.util.concurrent.*;

public class MyThreadPoolExecutorClient {
    public static void main(String[] args) {


        ExecutorService executorService = MyExecutor.newMyFixedThreadPool(2);
        Executors.newFixedThreadPool(1);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });


    }
}
