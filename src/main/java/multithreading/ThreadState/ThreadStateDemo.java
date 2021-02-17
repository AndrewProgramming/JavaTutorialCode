package multithreading.ThreadState;

public class ThreadStateDemo {
    public static void main(String[] args) {
        Thread printA = new Thread(new PrintA());
        System.out.println("Before start()");
        System.out.println("is alive:" + printA.isAlive());
        printA.start();
        System.out.println("After start()");
        try {
            Thread.currentThread().sleep(3000);
            System.out.println("is alive:" + printA.isAlive());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

class PrintA implements Runnable {
    @Override
    public void run() {
        int counter = 0;
        while (counter++ < 3) {
            System.out.println("A");
            try {
                Thread.sleep(2000);
                System.out.println("in loop is alive:" + Thread.currentThread().isAlive());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
