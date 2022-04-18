package Sorting;

public class MergeSortedArrays {
    private static void mergeArrays(int[] num1, int[] num2) {
        int i = 0, j = 0;
        while (i < num1.length && j < num2.length) {
            if (num1[i] <= num2[j]) {
                System.out.println(num1[i]);
                i++;
            } else {
                System.out.println(num2[j]);
                j++;
            }
        }
        while (i < num1.length) {
            System.out.println(num1[i]);
            i++;
        }

        while (j < num2.length) {
            System.out.println(num2[j]);
            j++;
        }

    }
}
