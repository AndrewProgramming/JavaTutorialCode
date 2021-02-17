package objectClass;

public class EqualsMethodDemo {

    public static void main(String[] args) {
        Car audi = new Car("audi", "red");
        Car GLE = new Car("benz", "yellow");
        Car smart = new Car("benz", "yellow");

//        //This is true
//        System.out.println(audi.equals(audi));
//        //This is not true
//        System.out.println(audi.equals(GLE));
        //This is true
        System.out.println(GLE.equals(smart));

    }
}

class Car {
    private String name;
    private String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public boolean equals(Object o) {
        if (o instanceof Car)
            return name == ((Car) o).name;
        else
            return this == o;
    }


}
