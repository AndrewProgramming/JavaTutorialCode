package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test05 {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
    Class c1 = Class.forName("reflection.User");

    System.out.println(c1.getName());//获得包名+类名
    System.out.println(c1.getSimpleName()); //获得类名

    //获得类的属性
    System.out.println("===============================");
    Field[] fields = c1.getDeclaredFields();

    for (Field item : fields) {
      System.out.println(item);
    }

    System.out.println("=============获取指定的属性值================");

    Field name = c1.getDeclaredField("name");
    System.out.println(name);

    System.out.println("=============获取类的方法================");
    Method[] methods = c1.getMethods();
    for (Method item : methods) {
      System.out.println(item);
    }

    System.out.println("=============获取类的方法,使用getDeclaredMethods================");

    Method[] methods1 = c1.getDeclaredMethods();
    for (Method item : methods1) {
      System.out.println(item);
    }

    System.out.println("=============获取类的指定方法================");

    Method getName = c1.getMethod("getName", null);
    System.out.println(getName);

    Method setName = c1.getMethod("setName", String.class);
    System.out.println(setName);

    System.out.println("=============获取构造器================");

    Constructor[] constructors = c1.getConstructors();
    for (Constructor item : constructors) {
      System.out.println(item);
    }

    Constructor[] constructors1 = c1.getDeclaredConstructors();
    for (Constructor item : constructors1) {
      System.out.println(item);
    }

    Constructor declaredConstructor = c1
        .getDeclaredConstructor(String.class, String.class, int.class);
    System.out.println("指定构造器" + declaredConstructor);
  }
}
