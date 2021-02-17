package oop.refrenceVariable;

public class Car {
    private String gear;
    private String wheel;

    public static void main(String[] args) {
        Car benz = new Car();
        Car bmw = new Car();

        bmw = benz;

        System.out.println(benz.gear);


    }
}
