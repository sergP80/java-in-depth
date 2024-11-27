package ua.edu.chmnu.advanced_java.oop.generic;

public interface List<T>  {

    int size();

    int capacity();

    boolean isEmpty();

    T get(int index);

    T set(int index, T element);

    void add(T element);

    int indexOf(T element);

    boolean remove(T element);

    void addAll(List<? extends T> list);
}
