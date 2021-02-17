package multithreading.volatileDemo;

public class VolatileDemo {

    public static volatile int n = 0;

    public synchronized static void increase1() {
        n++;
    }

    //这个测试用例，总共是20个线程， 每个限制都加加 10000 次， 最后的结果理论上是 20*10000=200,000
//但是实际上， 每次的结果都小于理论值。
    public void testNotThreadSafe1() throws InterruptedException {
        Thread[] tmpThreads = new Thread[20];
        for (int i = 0; i <= tmpThreads.length - 1; i++) {
            tmpThreads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        increase1();
                    }
                    System.out.println("Over.");
                }
            });
            tmpThreads[i].start();
        }
        Thread.sleep(2000);
        System.out.println(n);//最后的结果理论上是 20*10000=200,000,
    }

    public static void main(String[] args) {
        VolatileDemo volatileDemo = new VolatileDemo();
        try {
            volatileDemo.testNotThreadSafe1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
