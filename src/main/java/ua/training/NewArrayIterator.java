package ua.training;

import java.util.Iterator;

public class NewArrayIterator<T>implements Iterator<T> {
    private T[] values;
    private int position = 0;
    private int size = 0;

    public NewArrayIterator(T[] values, int size) {
        this.values = values;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return position < size;
    }

    @Override
    public T next() {
        return values[position++];
    }
}
