package oop.constructor.thisKeyword;

public class ThisKeywordDemo {

    public static void main(String[] args) {
        Person person = new Person("Java");
        System.out.println(person.getName());
        person.setName("new name");
        System.out.println(person.getName());
    }
}


class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        this("Andrew Programming");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

