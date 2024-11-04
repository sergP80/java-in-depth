package ua.edu.chmnu.advanced_java.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleMatrixTest {

    @Test
    void test1() {
        /**
         * |2
         * |3 4
         * |4 5 6
         */
        TriangleMatrix m = new TriangleMatrix(3, (i, j) -> (double) (i + j + 2));

        assertEquals(m.getBy(0, 1), m.getBy(1, 0));

    }
}