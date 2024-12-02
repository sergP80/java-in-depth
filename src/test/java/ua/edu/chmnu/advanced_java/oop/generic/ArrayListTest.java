package ua.edu.chmnu.advanced_java.oop.generic;

import org.junit.jupiter.api.Test;

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
}