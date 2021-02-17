package objectandclass;

public class TestCourse {

  public static void main(String[] args) {
    Course course1 = new Course("Data structures");
    Course course2 = new Course("Database systems");

    course1.addStudent("Peter Jones");
    course1.addStudent("Kim Smith");
    course1.addStudent("Anne Ken");

    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");

    System.out.println("Number of students in course1:" + course1.getNumberOfStudents());

    String[] studentsInCourse1 = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++) {
      System.out.print(studentsInCourse1[i] + ",");
    }

    course1.dropStudent("Anne Ken");
    System.out.println();

    for (int i = 0; i < course1.getNumberOfStudents(); i++) {
      System.out.print(studentsInCourse1[i] + ",");
    }
  }
}
