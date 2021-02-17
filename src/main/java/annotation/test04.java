package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class test04 {

  @MyAnnotation2(name = "Andrew",age = 30)
  public void testAnnotation2(){

  }
}


@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
  String name() default  "";
  int age() default 0;

  String[] schools() default {"Harward,Qinghua"};
}

