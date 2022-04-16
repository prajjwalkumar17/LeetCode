package LeetCodeChallenge;

import java.util.Arrays;

public class ClosestTo0 {

    public static int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == 0) return nums[mid];
            if (nums[mid] > 0) high = mid - 1;
            if (nums[mid] < 0) low = mid + 1;
        }
        if ((low + 1) <= nums.length - 1
                && -nums[low] == nums[low + 1])
            return nums[low + 1];

        if ((low + 1) <= nums.length - 1 &&
                -nums[low] >= nums[low + 1])
            return nums[low + 1];

        if ((low - 1) >= 0
                && -nums[low - 1] < nums[low] || nums[low] > nums[low])
            return nums[low - 1];

        return nums[low];
    }


}
