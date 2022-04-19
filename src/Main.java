import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] num2 = new int[]{5, 1, 1, 2, 0, 0};


        sortArray(num2);


    }


    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length);
    }

    static int[] mergeSort(int[] nums, int l, int r) {
        if (r > l) {
            int mid = l + (r - l) / 2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);
            merge(nums, l, mid, r);
        }
        return nums;
    }

    static void merge(int[] nums, int l, int m, int r) {
        //create separate arrays for the elements
        //array is 0 indexed
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) left[i] = nums[l + i];
        for (int j = 0; j < n2; j++) right[j] = nums[m + 1 + j];

        //sorting process
        int i = 0, j = 0, k = 0;
        while (i < j) {
            if (left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
                k++;
            } else {
                nums[k] = right[j];
                j++;
                k++;
            }
            while (i < n1) {
                nums[k] = left[i];
                i++;
                k++;
            }
            while (j < n2) {
                nums[k] = left[i];
                i++;
                k++;
            }
        }


    }
}

