package generic;

public class GenericStaticMethodDemo2 {

  public static void main(String[] args) {

    Integer[] integers = {1,2,3,4,5};
    String[] strings = {"London","Tokyo","New York"};

    GenericStaticMethodDemo2.<Integer>print(integers);
    GenericStaticMethodDemo2.<String>print(strings);

  }

  public static <E extends Object> void print(E[] list){
    for (int i=0;i<list.length;i++){
      System.out.print(list[i]+" ");
    }
    System.out.println();
  }

}
