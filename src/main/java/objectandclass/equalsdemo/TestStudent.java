package objectandclass.equalsdemo;

public class TestStudent {

  public static void main(String[] args) {
    Student student1 = new Student("Andrew", "Programming");
    Student student2 = new Student("Andrew", "Coding");

    System.out.println(student1.equals(student2));
  }

}
