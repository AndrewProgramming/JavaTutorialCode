package java8;

interface talk{

}

@FunctionalInterface
interface sayable extends talk{
    void say(String msg);   // abstract method

    // It can contain any number of Object class methods.
    int hashCode();

    String toString();

    boolean equals(Object obj);

    static void sayHi() {
        System.out.println("Hi");
    }
}

public class FunctionalInterfaceExample2 implements sayable {
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();
        fie.say("Hello there");
    }
}  