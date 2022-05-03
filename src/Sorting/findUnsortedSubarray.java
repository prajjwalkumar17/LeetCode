package Sorting;

public class findUnsortedSubarray {

    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 1; i < nums.length; i++) {
            //finding min element from left until the right elem is less than left
            if (nums[i] < nums[i - 1]) flag = true;
            if (flag) min = Math.min(min, nums[i]);
        }
        flag = false;
        for (int i = nums.length - 2; i >= 0; i--) {
            //finding max elem until the left element is greater than the right
            if (nums[i] > nums[i + 1]) flag = true;
            if (flag) max = Math.max(max, nums[i]);
        }
        int l, r;
        for (l = 0; l < nums.length; l++)
            //finding correct pos for the min elem
            if (nums[l] > min) break;

        for (r = nums.length - 1; r >= 0; r--)
            //finding correct pos for the max elem
            if (nums[r] < max) break;

        return (r - l) < 0 ? 0 : r - l + 1;
    }
}
