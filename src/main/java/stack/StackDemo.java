package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();

        stack.push("Andrew");
        stack.push("Tracy");
        stack.push("Kobe");
        stack.push("James");

        System.out.println(stack);

        // Looks at the object at the top of this stack without removing it from the stack.
        stack.peek();

        //Removes the object at the top of this stack and returns that object as the value of this function.
        stack.pop();

        //Returns the 1-based position where an object is on this stack.
        System.out.println(stack.search("Tracy"));
        System.out.println(stack);

    }
}
