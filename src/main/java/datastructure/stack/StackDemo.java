package datastructure.stack;

import java.util.Stack;

public class StackDemo {

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);

    System.out.println(stack);


    System.out.println(stack.pop());

    System.out.println(stack);

    System.out.println(stack.peek());
    System.out.println(stack);

    while (!stack.isEmpty()){
      System.out.println(stack.pop());
    }

    System.out.println(stack);

  }
}
