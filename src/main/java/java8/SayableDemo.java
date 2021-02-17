package java8;

interface Sayable {
    // Default method
    default void say() {
        System.out.println("Hello, this is default method");
    }

    // Abstract method
    void sayMore(String msg);

    static void sayLounder(String msg){
        System.out.println(msg);
    }


}

public class SayableDemo implements Sayable {
    public void sayMore(String msg) {        // implementing abstract method
        System.out.println(msg);
    }

    @Override
    public void say() {
        System.out.println("my say");
    }

    public static void main(String[] args) {
        Sayable dm = new SayableDemo();
        dm.say();   // calling default method
        dm.sayMore("Work is worship");  // calling abstract method
        Sayable.sayLounder("say lounder!");
    }
}
