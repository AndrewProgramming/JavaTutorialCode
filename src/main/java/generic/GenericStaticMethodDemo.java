package generic;

public class GenericStaticMethodDemo {

  public static void main(String[] args) {

    Integer[] integers = {1,2,3,4,5};
    String[] strings = {"London","Tokyo","New York"};

    GenericStaticMethodDemo.<Integer>print(integers);
    GenericStaticMethodDemo.<String>print(strings);

  }

  public static <E> void print(E[] list){
    for (int i=0;i<list.length;i++){
      System.out.print(list[i]+" ");
    }
    System.out.println();
  }

}
