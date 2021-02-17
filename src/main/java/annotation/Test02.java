package annotation;

public class Test02 {

  public static void main(String[] args) {
   testDeprecated();

  }

  //不方便程序员使用，因为有更好的方式。如果强烈需要使用，也是可以的
  @Deprecated
  public static void testDeprecated(){

  }

  @SuppressWarnings({"unused","deprecation"})
  public static void unusedMethod(){

  }
}
