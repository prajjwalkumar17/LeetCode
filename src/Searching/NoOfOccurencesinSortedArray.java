package Searching;

public class NoOfOccurencesinSortedArray {
    private static int returnOcuurences(int[] nums, int target) {
        int first = firstOccurence(nums, target);
        if (first == -1) return 0;
        else return (lastOcuurence(nums, target) - first + 1);
    }

    private static int lastOcuurence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                if (mid == nums.length - 1 || nums[mid] != nums[mid + 1]) return mid;
                else low = mid + 1;
            } else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    private static int firstOccurence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (nums[mid] == target) {
                if (mid == 0 || nums[mid] != nums[mid - 1]) return mid;
                else high = mid - 1;
            } else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
