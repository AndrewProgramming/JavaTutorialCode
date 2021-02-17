package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test06 {

  @SuppressWarnings("all")
  public static void main(String[] args)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
    Class c1 = Class.forName("reflection.User");

    //调用无参构造函数
    User user = (User) c1.newInstance();
    System.out.println(user);

    //调用有参数的构造函数
    Constructor constructor = c1.getDeclaredConstructor(String.class, String.class, int.class);
    User user2 = (User) constructor.newInstance("1", "Andrew", 22);

    System.out.println(user2);


    //通过反射调用方法
    User user3 = (User) c1.newInstance();
    Method setName = c1.getDeclaredMethod("setName", String.class);

    setName.invoke(user3,"Andrew3");

    System.out.println(user3.getName());


    //通过反射直接操作属性
    User user4= (User) c1.newInstance();
    Field nameField=c1.getDeclaredField("name");

    //关闭了程序的安全监测
    nameField.setAccessible(true);

    nameField.set(user4,"Andrew4");
    System.out.println(user4.getName());
  }

}
