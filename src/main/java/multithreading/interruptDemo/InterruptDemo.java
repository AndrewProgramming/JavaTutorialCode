package multithreading.interruptDemo;

public class InterruptDemo {

    public static void main(String[] args) {
        Thread thread = new Thread(new PrintA());
        thread.start();
        try {
            Thread.currentThread().sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}

class PrintA implements Runnable {
    @Override
    public void run() {
        int counter = 0;
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(counter++);
        }
        System.out.println("PrintA thread should stop now!");
    }
}
