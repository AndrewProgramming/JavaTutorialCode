package multithreading.executorPool;

import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;

public class ThreadPriorityDemo {

    public static void main(String[] args) {
//        ThreadPriorityDemo.MyThreadFactory myThreadFactory = new ThreadPriorityDemo().new MyThreadFactory();
        MyThreadFactory myThreadFactory = new MyThreadFactory();
        ArrayList<Thread> threadArrayList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Thread t1_min = myThreadFactory.newThread(new PrintRandomNumber(), Thread.MIN_PRIORITY, "min_priority_thread");
            Thread t2_normal = myThreadFactory.newThread(new PrintRandomNumber(), Thread.NORM_PRIORITY, "normal_priority_thread");
            Thread t3_max = myThreadFactory.newThread(new PrintRandomNumber(), Thread.MAX_PRIORITY, "max_priority_thread");

            threadArrayList.add(t1_min);
            threadArrayList.add(t2_normal);
            threadArrayList.add(t3_max);

        }

        for (Thread t : threadArrayList) {
            t.start();
        }

    }

    private static class MyThreadFactory implements ThreadFactory {

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            return thread;
        }

        public Thread newThread(Runnable r, int threadPriority, String threadName) {
            Thread t = newThread(r);
            t.setPriority(threadPriority);
            t.setName(threadName);
            return t;
        }
    }


}

class PrintRandomNumber implements Runnable {
    @Override
    public void run() {
        System.out.println((Thread.currentThread().getName() + ":" + (int) Math.random() * 100));
    }
}

