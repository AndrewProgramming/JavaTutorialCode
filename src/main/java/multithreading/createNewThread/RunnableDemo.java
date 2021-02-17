package multithreading.createNewThread;

public class RunnableDemo {

    public static void main(String[] args) {
        Runnable show100A = new Show100A();

        Thread threadA = new Thread(show100A);
        threadA.start();
    }
}

class Show100A implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("a");
        }
    }
}
