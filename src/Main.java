import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[]{3, 21, 12, 2};

    }
















/*
    public static String findKthLargest(String[] nums, int k) {
        int l = 0, h = nums.length - 1;
        int reqIndex = nums.length - k;
        while (l <= h) {
            int p = lomutoPartition(nums, l, h);
            if (p == reqIndex) return nums[p];
            else if (p < reqIndex) l = p + 1;
            else h = p - 1;
        }
        return "";

    }

    static int lomutoPartition(String[] arr, int l, int h) {
        String p = arr[h];
        int index = l - 1;
        for (int i = l; i <= h - 1; i++) {
            if (new BigInteger(arr[i]).compareTo(new BigInteger(p)) <= 0) swap(arr, i, ++index);
        }
        swap(arr, ++index, h);
        return index;
    }

    static void swap(String[] arr, int l, int h) {
        String temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;

    }*/


}

