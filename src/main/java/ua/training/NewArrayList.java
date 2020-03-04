package ua.training;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class NewArrayList<T> implements SimpleArrayList<T> {

    private T[] values;
    private int size = 0;

    public NewArrayList(int size) {
        this.values = (T[]) new Object[size];
    }

    public NewArrayList() {
        this(10);
    }

    @Override
    public boolean add(T element) {
        if (values.length > size) {
            values[size++] = element;
        } else {
            createNewArrayAndCopyValues(element);
        }
        return true;
    }

    private void createNewArrayAndCopyValues(T element) {
        T[] newValues = (T[]) new Object[size * 2];
        newValues = Arrays.copyOf(values, values.length);
        newValues[size] = element;
        size++;
        values = newValues;
    }

    @Override
    public T set(Integer position, T element) {
        if (position < size) {
            T oldElement = values[position];
            values[position] = element;
            return oldElement;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public T get(Integer position) {
        if (position < size) {
            return values[position];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean remove(T element) {
        for (int index = 0; index < size; index++) {
            if (values[index].equals(element)) {
                System.arraycopy(values, index + 1, values, index, size - index);
                size--;
                break;
            }
        }
        return true;
    }

    @Override
    public void sort(Comparator<T> comparator) {
        Arrays.sort(values, 0, size, comparator);
    }

    @Override
    public boolean contains(T element) {
        for (int index = 0; index < size; index++) {
            if (values[index].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer size() {
        return size;
    }

    @Override
    public void clear() {
        Arrays.fill(values, null);
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new NewArrayIterator<>(values, size);
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int index = 0; index < size; index++) {
            stringBuilder.append(values[index]);
            stringBuilder.append(", ");
        }
        stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "]");
        //return Arrays.toString(values);
        return stringBuilder.toString();
    }
}
