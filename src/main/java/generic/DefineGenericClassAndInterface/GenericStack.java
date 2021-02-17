package generic.DefineGenericClassAndInterface;

import java.util.ArrayList;

public class GenericStack<E> {

    ArrayList<E> arrayList = new ArrayList<E>();

    public void push(E e) {
        arrayList.add(e);

    }

    public E pop() {
        E element = arrayList.get(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        return element;
    }

    public boolean isEmpty() {
        return arrayList.size() == 0 ? true : false;
    }
}
