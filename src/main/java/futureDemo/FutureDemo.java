package futureDemo;

import java.util.concurrent.*;

public class FutureDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(new GetString());
        try {
            Thread.currentThread().sleep(3000);
            System.out.println("awake");
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}

class GetString implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.currentThread().sleep(100);
        return "Hello Callable";
    }
}