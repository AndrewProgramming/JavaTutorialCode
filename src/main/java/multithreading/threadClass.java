package multithreading;

public class threadClass {

    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        customThread.start();
    }
}

class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello i am a custom thread!");
    }
}
