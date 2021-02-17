package reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@TableStudent("MyStudent")
public class MyStudent {


  @FiledStudent(columnName = "id", type = "String", length = 10)
  private String id;
  @FiledStudent(columnName = "name", type = "String", length = 100)
  private String name;
  @FiledStudent(columnName = "age", type = "int", length = 10)
  private int age;

  public MyStudent() {
  }

  public MyStudent(String id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "MyStudent{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableStudent {

  String value();
}


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FiledStudent {

  String columnName();

  String type();

  int length();
}

