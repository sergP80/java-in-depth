package ua.edu.chmnu.advanced_java.oop.generic;

class ArrayListHelper {

    /**
     * Resize given array
     * @param source - array
     * @param size - current array size
     * @param capacity - new capacity
     * @return new capacity array
     * @param <T>
     */
    static  <T> T[] resize(T[] source, int size, int capacity) {
        T[] newArray = (T[]) new Object[capacity];

        System.arraycopy(source, 0, newArray, 0, size);

        return newArray;
    }

    /**
     * Fast remove item from this array start index from
     * @param source - array
     * @param size - array size
     * @param from - index of item to delete
     * @param <T>
     */
    static <T> void removeFrom(T[] source, int size, int from) {
        int count = size - from - 1;

        if (count > 0) {
            System.arraycopy(source, from + 1, source, from, count);
        }
    }
}
