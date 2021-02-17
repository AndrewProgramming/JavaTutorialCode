package oop.interfaceDemo;

import java.io.Serializable;

public class Dog implements Animal, Person, Serializable {
    @Override
    public void makeSound() {
        System.out.println("wangwang");
    }

    @Override
    public void speak() {
        System.out.println("Dog speak");
    }
}
