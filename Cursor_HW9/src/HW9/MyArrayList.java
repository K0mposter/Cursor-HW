package HW9;

import java.util.ArrayList;

public class MyArrayList<E> extends ArrayList<E> {
    private static final int DEFAULT_ARRAYLIST_CAPACITY = 15;
    private ArrayList<E> myArraylist;
    private int size;

    public MyArrayList(int capacity) {
        myArraylist = new ArrayList<>(capacity);
        size = 0;
    }
    public MyArrayList(){
        this(DEFAULT_ARRAYLIST_CAPACITY);
    }

    @Override
    public int size() {
        return size();
    }

    @Override
    public boolean isEmpty() {
        if(size<0) {
            throw new IllegalStateException("Size cant be <0");}
        return size ==0;
    }

    public static void main(String[] args) {
        // write your code here
    }
}
