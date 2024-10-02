package ua.edu.chmnu.advanced_java.arrays;

public class ArraySortMerge {

    public static int[] merge(final int[] array1, final int[] array2) {
        int[] result = new int[array1.length + array2.length];

        int resultIndex = 0, sourceIndex1 = 0, sourceIndex2 = 0 ;

        for (; sourceIndex1 < array1.length && sourceIndex2 < array2.length; resultIndex++) {
            if (array1[sourceIndex1] < array2[sourceIndex2]) {
                result[resultIndex] = array1[sourceIndex1++];
            } else {
                result[resultIndex] = array2[sourceIndex2++];
            }
        }

        while (sourceIndex1 < array1.length) {
            result[resultIndex++] = array1[sourceIndex1++];
        }

        while (sourceIndex2 < array2.length) {
            result[resultIndex++] = array2[sourceIndex2++];
        }

        return result;
    }

    public static void main(String[] args) {
    }
}
