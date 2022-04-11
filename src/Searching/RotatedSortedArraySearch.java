package Searching;

public class RotatedSortedArraySearch {
    private static int BSearch(int[] nums, int low, int high, int target) {
        if (high < low)
            return -1;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (target == nums[mid])
            return mid;
        if (target > nums[mid])
            return BSearch(nums, (mid + 1), high, target);
        return BSearch(nums, low, (mid - 1), target);
    }

    private static int findPivot(int[] nums, int low, int high) {
        // base cases
        if (high < low)
            return -1;
        if (high == low)
            return low;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (mid < high && nums[mid] > nums[mid + 1])
            return mid;
        if (mid > low && nums[mid] < nums[mid - 1])
            return (mid - 1);
        if (nums[low] >= nums[mid])
            return findPivot(nums, low, mid - 1);
        return findPivot(nums, mid + 1, high);
    }

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums, 0, nums.length - 1);

        if (pivot == -1)
            return BSearch(nums, 0, nums.length - 1, target);

        if (nums[pivot] == target)
            return pivot;
        if (nums[0] <= target)
            return BSearch(nums, 0, pivot - 1, target);

        return BSearch(nums, pivot + 1, nums.length - 1, target);
    }
}
