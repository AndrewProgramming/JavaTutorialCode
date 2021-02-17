package oop.staticKeywordDemo;

public class Student {

    private String name;
    public static String school = "Basketball123";

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
