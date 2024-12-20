package ua.edu.chmnu.advanced_java.oop.generic;

import java.util.function.Predicate;

public class ArrayList<T> implements List<T> {
    private static final int INITIAL_CAPACITY = 16;

    private T[] array;

    private int capacity;

    private int size = 0;

    public ArrayList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    public ArrayList() {
        this(INITIAL_CAPACITY);
    }

    @SafeVarargs
    public ArrayList(T... elements) {
        this(elements.length * 2);
        System.arraycopy(elements, 0, array, 0, elements.length);
        this.size = elements.length;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int capacity() {
        return this.capacity;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public T get(int index) {
        checkIndex(index);

        return this.array[index];
    }

    @Override
    public T set(int index, T element) {
        checkIndex(index);

        return this.array[index] = element;
    }

    @Override
    public void add(T element) {
        increaseIfRequired();

        ++this.size;

        this.array[size - 1] = element;
    }

    @Override
    public void add(int index, T element) {
        checkIndex(index);

        increaseIfRequired();

        System.arraycopy(array, index, array, index + 1, size - index);

        ++this.size;

        this.array[index] = element;

    }

    @Override
    public void addFirst(T element) {
        increaseIfRequired();

        System.arraycopy(this.array, 0, this.array, 1, this.size);

        this.array[0] = element;

        ++this.size;
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean remove(T element) {
        int index = indexOf(element);

        boolean result = index >= 0;

        if (result) {
            ArrayListHelper.removeFrom(this.array, this.size, index);

            --this.size;

            shrinkIfRequired();
        }

        return result;
    }

    @Override
    public int removeIf(Predicate<T> predicate) {
        int countOfDelete = 0;

        for (int i = 0; i < size; ++i) {
            if (predicate.test(this.array[i])) {
                ArrayListHelper.removeFrom(this.array, this.size, i);
                ++countOfDelete;
            }
        }

        shrinkIfRequired();

        return countOfDelete;
    }

    @Override
    public void addAll(List<? extends T> list) {
        for (int i = 0; i < list.size(); i++) {
            this.add(list.get(i));
        }
    }

    private void increaseIfRequired() {
        if (this.size == this.capacity) {
            this.capacity *= 2;

            this.array = ArrayListHelper.resize(this.array, size, this.capacity);
        }
    }

    private void shrinkIfRequired() {
        if (this.capacity > (2 * this.size + this.size / 2)) {
            this.capacity = Math.max(INITIAL_CAPACITY, capacity / 2);
            this.array = ArrayListHelper.resize(this.array, size, this.capacity);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
