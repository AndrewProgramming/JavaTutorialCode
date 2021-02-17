package multithreading.syncDemo;

class Counter {
    private int c;

    public synchronized void increment() {
        c++;
        //get c value
        //c increment by 1
        //assign to c back
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}