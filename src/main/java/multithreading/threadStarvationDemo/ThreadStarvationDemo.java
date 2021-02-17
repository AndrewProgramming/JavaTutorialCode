package multithreading.threadStarvationDemo;

// Java program to illustrate Starvation concept
class StarvationDemo extends Thread {
    static int threadcount = 1;

    public void run() {
        System.out.println(threadcount + "st Child" +
                " Thread execution starts");
        System.out.println("Child thread execution completes");
        threadcount++;
    }

    public static void main(String[] args)
            throws InterruptedException {
        System.out.println("Main thread execution starts");

        // Thread priorities are set in a way that thread5
        // gets least priority.
        StarvationDemo thread1 = new StarvationDemo();
        thread1.setPriority(10);
        StarvationDemo thread2 = new StarvationDemo();
        thread2.setPriority(9);
        StarvationDemo thread3 = new StarvationDemo();
        thread1.setPriority(8);
        StarvationDemo thread4 = new StarvationDemo();
        thread1.setPriority(7);
        StarvationDemo thread5 = new StarvationDemo();
        thread1.setPriority(6);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Here thread5 have to wait beacause of the
        // other thread. But after waiting for some
        // interval, thread5 will get the chance of
        // execution. It is known as Starvation
        thread5.start();

        System.out.println("Main thread execution completes");
    }
}

