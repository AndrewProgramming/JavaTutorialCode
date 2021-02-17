package reflection;

public class Test01 {

  public static void main(String[] args)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    Class c1 = Class.forName("reflection.User");

    System.out.println(c1);

    Class c2 = Class.forName("reflection.User");
    Class c3 = Class.forName("reflection.User");
    Class c4 = Class.forName("reflection.User");

    System.out.println(c2.hashCode());
    System.out.println(c3.hashCode());
    System.out.println(c4.hashCode());

    //User user1 = new User();

    User user2= (User) c1.newInstance();


    boolean t = user2 instanceof User;

    System.out.println(t);

  }
}


