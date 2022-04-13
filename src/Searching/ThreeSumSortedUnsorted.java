package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumSortedUnsorted {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            //avoid duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            twoPointer(nums, i + 1, -nums[i], res);
        }
        System.out.println(res);
        return res;
    }

    public static void twoPointer(int[] arr, int low, int target, List<List<Integer>> res) {
        int high = arr.length - 1;
        while (low < high) {
            if (target == (arr[low] + arr[high])) {
                res.add(Arrays.asList(arr[low++], arr[high--], -target));
                //avoid duplicate triplets
                while (low < high && arr[low] == arr[low - 1]) low++;
                while (low < high && arr[high] == arr[high + 1]) high--;
            } else if (target > (arr[low] + arr[high]))
                low++;
            else high--;
        }
    }
}
