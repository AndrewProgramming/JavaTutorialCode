package multithreading.createNewThread;

public class ExtendThreadDemo {

    public static void main(String[] args) {
//        Show100B show100B = new Show100B();
//        show100B.start();
//
        Thread thread = new Thread(new Show100B());
        thread.start();

    }

}

class Show100B extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.printf("b ");
        }
    }
}
