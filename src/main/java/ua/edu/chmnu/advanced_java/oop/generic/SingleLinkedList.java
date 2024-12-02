package ua.edu.chmnu.advanced_java.oop.generic;

import java.util.function.Predicate;

public class SingleLinkedList<T> implements List<T> {

    private SingleLinkedNode<T> head = null;

    private SingleLinkedNode<T> tail = null;

    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size > 0;
    }

    @Override
    public T get(int index) {
        checkIndex(index);

        return SingleLinkedListHelper.getBy(head, index);
    }

    @Override
    public T set(int index, T element) {
        checkIndex(index);

        return SingleLinkedListHelper.setBy(head, index, element);
    }

    @Override
    public void add(T element) {
        head = SingleLinkedListHelper.addFirst(head, element);

        if (tail == null) {
            tail = head;
        }

        ++size;
    }

    @Override
    public void add(int index, T element) {
        checkIndex(index);

    }

    @Override
    public void addLast(T element) {
        tail = SingleLinkedListHelper.addLast(tail, element);
        if (head == null) {
            head = tail;
        }

        ++size;
    }

    @Override
    public int indexOf(T element) {
        return SingleLinkedListHelper.indexOf(head, element);
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

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
