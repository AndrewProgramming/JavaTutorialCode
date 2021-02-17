package oop.objectDemo;

public class ObjectClassDemo {
    public static void main(String[] args) {
        ObjectClassDemo instance = new ObjectClassDemo();
        System.out.println(instance.toString());

        System.out.println(instance.hashCode());

        ObjectClassDemo instance1 = new ObjectClassDemo();

        System.out.println(instance.equals(instance1));


        instance1 = null;

        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Gc call it!");
    }
}
