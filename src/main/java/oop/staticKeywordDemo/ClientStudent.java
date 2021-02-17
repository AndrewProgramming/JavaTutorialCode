package oop.staticKeywordDemo;

public class ClientStudent {

    public static void sayHi() {
        System.out.println("say hi!");
    }


    public void sayHello() {
        System.out.println("say hello!");
    }

    static {
        System.out.println("static block");
    }


    public static void main(String[] args) {
        Student james = new Student("james");
        Student kobe = new Student("kobe");

        james.setName("leborn");

        System.out.println(james.getName() + ":" + james.school);
        System.out.println(kobe.getName() + ":" + kobe.school);


        ClientStudent.sayHi();

        ClientStudent instance = new ClientStudent();
        instance.sayHello();


    }
}
