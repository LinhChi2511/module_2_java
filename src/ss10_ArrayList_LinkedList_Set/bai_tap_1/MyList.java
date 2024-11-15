package ss10_ArrayList_LinkedList_Set.bai_tap_1;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size =0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

}
