package oop.constructor;

public class Bicycle {
    private int gear;
    private int cadence;
    private int speed;

    public Bicycle() {
    }

    public Bicycle(int gear) {
        this.gear = gear;
    }

    public Bicycle(int gear, int cadence) {
        this.gear = gear;
        this.cadence = cadence;
    }

    public Bicycle(int gear, int cadence, int speed) {
        this.gear = gear;
        this.cadence = cadence;
        this.speed = speed;
    }

    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        System.out.println(bike1.gear);
        System.out.println(bike1.cadence);
        System.out.println(bike1.speed);

        Bicycle bike2 = new Bicycle(1, 2);
        Bicycle bike3 = new Bicycle(1, 2, 3);

    }


}
