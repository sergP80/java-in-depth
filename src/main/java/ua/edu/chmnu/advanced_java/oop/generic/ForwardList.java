package ua.edu.chmnu.advanced_java.oop.generic;

import java.util.function.Predicate;

public class ForwardList<T> implements List<T> {

    private ForwardNode<T> head = null;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int capacity() {
        return size();
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(T element) {

    }

    @Override
    public int indexOf(T element) {
        if (head == null) {
            return -1;
        }

        return 0;
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public int removeIf(Predicate<T> predicate) {
        return 0;
    }

    @Override
    public void addAll(List<? extends T> list) {

    }
}
