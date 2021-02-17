package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Test08 {

  public static void main(String[] args) throws NoSuchFieldException {
    Class c1 = MyStudent.class;

    Annotation[] annotations = c1.getAnnotations();

    for (Annotation item : annotations) {
      System.out.println(item);
    }

    TableStudent tableStudent = (TableStudent) c1.getAnnotation(TableStudent.class);

    String value = tableStudent.value();
    System.out.println(value);

    Field field = c1.getDeclaredField("id");
    FiledStudent annotation = field.getAnnotation(FiledStudent.class);
    System.out.println(annotation.columnName());
    System.out.println(annotation.type());
    System.out.println(annotation.length());

    //在数据库里根据注解的值创建对应的表结构
  }
}
