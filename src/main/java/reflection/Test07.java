package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test07 {

  public static void main(String[] args)
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    //普通的方式来创建对象
    test01();

    //反射的方式来创建对象，不关闭安全监测机制
    test02();

    //反射的方式来创建对象，关闭安全监测机制
    test03();
  }

  public static void test01() {

    User user = new User();

    long startTime = System.currentTimeMillis();

    for (int i = 0; i < 1000000000; i++) {
      user.getName();
    }

    long endTime = System.currentTimeMillis();

    System.out.println("普通方式执行10亿次：" + (endTime - startTime) + "ms");
  }


  //反射的方式来创建对象，不关闭安全监测机制
  public static void test02()
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    User user = new User();

    Class c1 = user.getClass();

    Method getName = c1.getDeclaredMethod("getName", null);

    long startTime = System.currentTimeMillis();

    for (int i = 0; i < 1000000000; i++) {
      getName.invoke(user, null);
    }

    long endTime = System.currentTimeMillis();

    System.out.println("反射的方式来创建对象，不关闭安全监测机制：" + (endTime - startTime) + "ms");

  }


  //反射的方式来创建对象，关闭安全监测机制
  public static void test03()
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    User user = new User();

    Class c1 = user.getClass();

    Method getName = c1.getDeclaredMethod("getName", null);

    getName.setAccessible(true);
    long startTime = System.currentTimeMillis();

    for (int i = 0; i < 1000000000; i++) {
      getName.invoke(user, null);
    }

    long endTime = System.currentTimeMillis();

    System.out.println("反射的方式来创建对象，关闭安全监测机制：" + (endTime - startTime) + "ms");

  }
}
