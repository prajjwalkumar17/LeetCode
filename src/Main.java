import jdk.jfr.Label;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedSubarray(nums));


    }

    private static int findUnsortedSubarray(int[] nums) {
        if (nums.length == 1) return 0;
        int low = 0, high = nums.length - 1;
        int count = nums.length;
        while (low <= high) {
            if (nums[low] <= nums[low + 1] && nums[high] >= nums[high - 1]) {
                low++;
                high--;
                count -= 2;
            } else if (nums[low] <= nums[low + 1] && nums[high] < nums[high - 1]) {
                low++;
                count--;
            } else if (nums[low] > nums[low + 1] && nums[high] >= nums[high - 1]) {
                high--;
                count--;
            } else if (nums[low] > nums[low + 1] && nums[high] < nums[high - 1]) break;
        }
        return count = Math.max(count, 0);
    }
}

