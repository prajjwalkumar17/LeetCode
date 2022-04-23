package Sorting;

public class KthLargestInArray {

    public static int findKthLargest(int[] nums, int k) {
        int requiredIndex = nums.length - k;
        int l = 0;
        int h = nums.length - 1;
        while (l <= h) {
            int p = lomutoPartition(nums, l, h);
            if (p == requiredIndex) return nums[p];
            else if (p < requiredIndex) l = p + 1;
            else h = p - 1;
        }
        return -1;
    }

    private static int lomutoPartition(int[] arr, int l, int h) {
        int p = arr[h];
        int index = l - 1;
        for (int i = l; i <= h - 1; i++)
            if (arr[i] <= p) swap(arr, i, ++index);
        swap(arr, ++index, h);
        return index;
    }

    private static void swap(int[] arr, int l, int h) {
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
    }
}
