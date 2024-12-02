package ua.edu.chmnu.advanced_java.oop.generic;

import java.util.function.Predicate;

public interface List<T>  {

    int size();

    int capacity();

    boolean isEmpty();

    T get(int index);

    T set(int index, T element);

    void add(T element);

    int indexOf(T element);

    boolean remove(T element);

    int removeIf(Predicate<T> predicate);

    void addAll(List<? extends T> list);
}
