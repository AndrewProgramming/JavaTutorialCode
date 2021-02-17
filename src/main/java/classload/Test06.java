package classload;

public class Test06 {

  public static void main(String[] args) throws ClassNotFoundException {
    //获取系统类加载器
    ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
    System.out.println(systemClassLoader);

    //获取拓展类加载器
    ClassLoader parent = systemClassLoader.getParent();
    System.out.println(parent);

    //获取根加载器
    ClassLoader bootstrap = parent.getParent();
    System.out.println(bootstrap);
    System.out.println("======================================");
    //测试当前类是哪个类加载器所加载
    ClassLoader cl1=Class.forName("classload.Test06").getClassLoader();
    System.out.println(cl1);

    //测试JDK内置的类是谁加载的
    ClassLoader cl2=Class.forName("java.lang.Object").getClassLoader();
    System.out.println(cl2);


    //如何获得系统类加载器可以加载的路径
    System.out.println(System.getProperty("java.class.path"));
  }
}
