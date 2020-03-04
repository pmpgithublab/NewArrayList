package ua.training;

import java.util.Comparator;

public interface SimpleArrayList<T> extends Iterable<T> {
    boolean add(T element);

    T set(Integer position, T element);

    T get(Integer position);

    boolean remove(T element);

    void sort(Comparator<T> comparator);

    boolean contains(T element);

    Integer size();

    void clear();

    boolean isEmpty();
}
