package generic;

public class GenericStackClient {


  public static void main(String[] args) {
    GenericStack<String> stack = new GenericStack<String>();
    stack.push("A");
    stack.push("B");


    System.out.println(stack.peek());

    System.out.println(stack.getSize());
    System.out.println(stack.pop());
    System.out.println(stack.getSize());

  }

}
