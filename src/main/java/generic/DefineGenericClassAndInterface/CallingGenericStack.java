package generic.DefineGenericClassAndInterface;

public class CallingGenericStack {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<String>();
        stack.push("Andrew");
        stack.push("Programming");
        stack.push("is great");

        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
