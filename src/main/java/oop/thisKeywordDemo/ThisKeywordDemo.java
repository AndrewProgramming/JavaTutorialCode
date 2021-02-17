package oop.thisKeywordDemo;

public class ThisKeywordDemo {

    private String name;
    private String gender;

    public ThisKeywordDemo(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public ThisKeywordDemo() {
        this("Andrew", "male");
    }
}
