package Sorting;

import java.util.Arrays;

public class UnionArray {
    private static int[] union(int[] num1, int[] num2) {
        Arrays.sort(num1);
        Arrays.sort(num2);
        int[] res = new int[num1.length + num2.length];
        int i = 0, j = 0, k = 0;
        while (i < num1.length && j < num2.length) {
            if (i > 0 && num1[i] == num1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && num2[j] == num2[j - 1]) {
                j++;
                continue;
            }
            if (num1[i] < num2[j]) {
                res[k++] = num1[i++];
            } else if (num1[i] > num2[j]) {
                res[k++] = num2[j++];
            } else {
                res[k++] = num1[i++];
                j++;

            }
        }
        while (i < num1.length) res[k++] = num1[i++];
        while (j < num2.length) res[k++] = num2[j++];


        return res;
    }
}
