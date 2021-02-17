package objectandclass;

public class TestStudent {

  public static void main(String[] args) {
    Student student = new Student();
    System.out.println("name " + student.name);
    System.out.println("age " + student.age);
    System.out.println("isScienceMajor? " + student.isScienceMajor);
    System.out.println("gender? " + student.gender);


    String name; // name has default value null
    int age; // age has default value 0
    boolean isScienceMajor; // isScienceMajor has default value false
    char gender; // c has default value '\u0000'

//    System.out.println(name);

    System.out.println(student.name.length());
  }
}

class Student {

  String name = "abc"; // name has default value null
  int age; // age has default value 0
  boolean isScienceMajor; // isScienceMajor has default value false
  char gender; // c has default value '\u0000'
}
