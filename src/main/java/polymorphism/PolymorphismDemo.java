package polymorphism;

interface Car {
    public String getCarName();
}

class BMW implements Car {

    public String getCarName() {
        return "BMW";
    }
}

class Audi implements Car {

    public String getCarName() {
        return "Audi";
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {
        Car audi = new Audi();
        System.out.println(audi.getCarName());


    }

}
