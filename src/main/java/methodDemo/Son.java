package methodDemo;

public class Son extends Father {

    @Override
    public void sayHello() {
        System.out.println("Son sayHello!");
    }

    public static void main(String[] args) {

        Son james = new Son();
        james.sayHello();

    }
}
