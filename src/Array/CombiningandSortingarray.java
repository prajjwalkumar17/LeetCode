package Array;

import java.util.Arrays;

public class CombiningandSortingarray {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 0, 0, 0};
        int size1 = 3;
        int[] array2 = new int[]{2, 5, 6};
        int size2 = 3;
        int[] result = combinearrayiterative(array1, size1, array2, size2);
        printArray(result);

    }

    private static int[] combinearrayiterative(int[] array1, int size1, int[] array2, int size2) {
        int j = 0;
        for (int i = size1; i < array1.length; i++) {
            array1[i] = array2[j];
            j++;
        }

        for (int p = 0; p < array1.length; p++) {
            for (int q = 0; q < array1.length; q++) {
                if (array1[p] < array1[q]) {
                    int k = array1[p];
                    array1[p] = array1[q];
                    array1[q] = k;
                }
            }
        }

        return array1;
    }

    private static int[] combinearrayrecursive(int[] array1, int size1, int[] array2, int size2) {
        if (size2 != 0) {
            array1[size1] = array2[size2 - 1];
            size1++;
            size2--;
        } else {
            Arrays.sort(array1);
            return array1;
        }
        return combinearrayrecursive(array1, size1, array2, size2);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}