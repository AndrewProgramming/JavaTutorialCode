package oop.abstractClass;

public class AnimalClient {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        dog.sleep();
        cat.sleep();

    }
}
