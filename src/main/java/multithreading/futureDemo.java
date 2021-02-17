package multithreading;

import java.util.concurrent.*;

public class futureDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future future = executorService.submit(new PrintA());
        try {
            while (!future.isDone()) {

            }

            String result = (String) future.get();
            System.out.println("isDone:" + future.isDone());
            System.out.println("result:" + result);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}

class PrintA implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Hello Callable";
    }
}
