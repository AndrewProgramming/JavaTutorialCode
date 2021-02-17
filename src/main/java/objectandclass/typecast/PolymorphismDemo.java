package objectandclass.typecast;

import objectandclass.Course;

public class PolymorphismDemo {

  public static void main(String[] args) {
    m(new GraduateStudent());
    m(new Student());
    m(new Person());
    m(new Object());

    Object o = new Course("wrong");//隐式转换 向上转换 upcasting
//    m(o);

    if (o instanceof Student) {
      Student b = (Student) o;//显示转换 向下转换  downcasting

    }

  }


  public static void m(Object x) {
    System.out.println(x.toString());
  }
}


class GraduateStudent extends Student {

}


class Student extends Person {

  public String toString() {
    return "Student";
  }
}


class Person extends Object {

  public String toString() {
    return "Person";
  }
}
