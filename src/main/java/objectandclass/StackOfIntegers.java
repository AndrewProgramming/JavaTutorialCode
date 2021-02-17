package objectandclass;

public class StackOfIntegers {

  private int size;

  private int[] elements;


  public static final int DEFAULT_CAPACITY = 16;

  public StackOfIntegers() {
    this(DEFAULT_CAPACITY);
  }

  public StackOfIntegers(int capacity) {
    this.elements = new int[capacity];
  }


  public boolean empty() {
    return size == 0;
  }

  public int getSize() {
    return size;
  }

  public int peek() {
    return elements[size - 1];
  }

  public int pop(){
    return elements[--size];
  }
}
