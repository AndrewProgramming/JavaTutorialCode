package generic.examples;

public class MyInteger extends GenericMath<Integer> {
    protected Integer add(Integer o1, Integer o2) {
        return o1 + o2;
    }

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger();
        System.out.println(myInteger.add(1, 2));
    }
}
