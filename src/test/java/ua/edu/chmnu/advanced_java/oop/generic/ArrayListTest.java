package ua.edu.chmnu.advanced_java.oop.generic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    @Test
    void shouldCreateEmptyIntArrayList() {
        List<Integer> list = new ArrayList<>();

        assertTrue(list.isEmpty());
    }

    @Test
    void shouldCreateArrayListAndAddElement() {
        List<Integer> list = new ArrayList<>();

        assertTrue(list.isEmpty());

        list.add(1);
        list.add(2);

        assertEquals(2, list.size());

        assertFalse(list.isEmpty());
    }

    @Test
    void shouldCreateArrayListAndAddElementsMoreThanCapacity() {
        List<Integer> list = new ArrayList<>();

        assertTrue(list.isEmpty());

        int cap = list.capacity();

        for (int i = 0; i <= cap; i++) {
            list.add(i + 1);
        }

        assertEquals(2 * cap, list.capacity());
    }

    @Test
    void shouldRemoveElementWithoutCapacityChange() {
        List<Integer> list = new ArrayList<>(1, 2, 4, 6, 9, 11, 16, 7, 22, 47);

        assertFalse(list.isEmpty());

        int initCap = list.capacity();

        int initSize = list.size();

        assertEquals(list.size() * 2, initCap);

        assertTrue(list.remove(4));
        assertFalse(list.remove(5));
        assertTrue(list.remove(11));

        assertEquals(list.capacity(), initCap);

        assertEquals(list.size(), initSize - 2);
    }

    @Test
    void shouldRemoveElementWithCapacityChangeToDefault() {
        List<Integer> list = new ArrayList<>(1, 2, 4, 6, 9, 11, 16, 7, 22, 47);

        assertFalse(list.isEmpty());

        int initCap = list.capacity();

        int initSize = list.size();

        assertEquals(list.size() * 2, initCap);

        assertTrue(list.remove(4));
        assertTrue(list.remove(6));
        assertTrue(list.remove(11));
        assertTrue(list.remove(7));
        assertTrue(list.remove(47));
        assertTrue(list.remove(9));
        assertFalse(list.remove(6));
        assertFalse(list.remove(7));

        assertEquals(list.capacity(), 16);

        assertEquals(list.size(), initSize - 6);
    }

    @Test
    void shouldRemoveElementWithCapacityChangeToHalfOfOrigin() {
        List<Integer> list = new ArrayList<>(1, 2, 4, 6, 9, 11, 16, 7, 22, 47, 1, -5, -4, 110, 22, -8, -3, 55);

        assertFalse(list.isEmpty());

        int initCap = list.capacity();

        int initSize = list.size();

        assertEquals(list.size() * 2, initCap);

        assertTrue(list.remove(4));
        assertTrue(list.remove(6));
        assertTrue(list.remove(11));
        assertTrue(list.remove(7));
        assertFalse(list.remove(6));
        assertFalse(list.remove(7));

        assertEquals(list.capacity(), initCap/2);
        assertTrue(list.capacity() > 16);

        assertEquals(list.size(), initSize - 4);
    }

    @Test
    void shouldAddFirst() {
        List<Integer> list = new ArrayList<>(1, 2, 4);

        list.addFirst(5);

        assertEquals(4, list.size());

        assertEquals(6, list.capacity());

        assertEquals(5, list.get(0));
        assertEquals(1, list.get(1));
        assertEquals(2, list.get(2));
        assertEquals(4, list.get(3));
    }

    @Test
    void shouldSuccessAddByIndex() {
        List<Integer> list = new ArrayList<>(1, 2, 4);

        list.add(1, -7);

        assertEquals(4, list.size());

        assertEquals(6, list.capacity());

        assertEquals(1, list.get(0));
        assertEquals(-7, list.get(1));
        assertEquals(2, list.get(2));
        assertEquals(4, list.get(3));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 3, 5})
    void shouldFailAddByIndexIfIndexOutOfBounds(int index) {
        List<Integer> list = new ArrayList<>(1, 2, 4);

        assertThrows(IndexOutOfBoundsException.class, () -> list.add(index, -7));

    }
}