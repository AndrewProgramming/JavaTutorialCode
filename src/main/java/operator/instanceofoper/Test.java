package operator.instanceofoper;

public class Test {

  public static void main(String[] args) {
    String name = "James";
    boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真
    System.out.println("result=" + result);
  }
}
