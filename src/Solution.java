import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Solution {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = new int[]{1};
        int size1 = 1;
        int[] array2 = new int[]{};
        int size2 = 0;
        int[] result = combinearray(array1, size1, array2, size2);
        printArray(result);

    }

    private static int[] combinearray(int[] nums1, int m, int[] nums2, int n) {
        if (n != 0) {
            nums1[m] = nums2[n - 1];
            m++;
            n--;
        } else {
            Arrays.sort(nums1);
            return nums1;
        }
        return combinearray(nums1, m, nums2, n);
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}



