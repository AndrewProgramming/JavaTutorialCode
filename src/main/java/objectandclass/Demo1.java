package objectandclass;

public class Demo1 {

  public static void main(String[] args) {
    Math.random();
    SimpleCircle ins = new SimpleCircle();
    ins.getArea();

    System.out.println(new SimpleCircle().getArea());
//    SimpleCircle.getArea();

  }

}
