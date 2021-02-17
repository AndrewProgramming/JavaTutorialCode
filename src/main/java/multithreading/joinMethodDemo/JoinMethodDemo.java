package multithreading.joinMethodDemo;

public class JoinMethodDemo {

    public static void main(String[] args) {

        Thread threadA = new Thread(new PrintTaskA());


        threadA.start();

    }


}

class PrintTaskA implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i == 50) {
                Thread threadB = new Thread(new PrintTaskB());
                try {
                    threadB.join();
                    threadB.start();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print(i + " ");
        }
    }
}

class PrintTaskB implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print("Wait!");
        }
    }
}
