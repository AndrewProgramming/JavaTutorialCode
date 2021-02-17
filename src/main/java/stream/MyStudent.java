package stream;

public class MyStudent {

  private String firstName;
  private String lastName;
  private String major;
  private int age;
  private double score;


  public MyStudent(String firstName, String lastName, String major, int age, double score) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.major = major;
    this.age = age;
    this.score = score;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }
}
