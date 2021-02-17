package objectandclass;

import java.util.Date;

public class TestStudentDemo {

  public static void main(String[] args) {
    StudentDemo studentDemo = new StudentDemo(111111, "Andrew");
//    Date dateCreated = studentDemo.getDateCreated();
//    dateCreated.setTime(2000);

  }

}

class StudentDemo {

  private int id;
  private String name;
  private Date dateCreated;

  public StudentDemo(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

//  public Date getDateCreated() {
//    return dateCreated;
//  }
}
