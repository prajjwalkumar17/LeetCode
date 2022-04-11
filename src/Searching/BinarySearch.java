package Searching;

public class BinarySearch {

    private static int binary_SearchITERATIVE(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    private static int binary_SearchRECURSIVE(int[] nums, int low, int high, int target) {
        if (low > high) return -1;
        int mid = (high + low) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) return binary_SearchRECURSIVE(nums, low, mid - 1, target);
        else return binary_SearchRECURSIVE(nums, mid + 1, high, target);
    }

    private static int binary_SearchRECURSIVEFirstIndex(int[] nums, int low, int high, int target) {
        if (low > high) return -1;
        int mid = (high + low) / 2;
        if (nums[mid] == target) {
            if (mid == 0 || nums[mid - 1] != nums[mid]) return mid;
            else return binary_SearchRECURSIVEFirstIndex(nums, 0, mid - 1, target);
        } else if (nums[mid] > target) return binary_SearchRECURSIVEFirstIndex(nums, low, mid - 1, target);
        else return binary_SearchRECURSIVEFirstIndex(nums, mid + 1, high, target);
    }

    private static int binary_SearchITERATIVELastindex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (nums[mid] == target) {
                if (mid == nums.length - 1 || nums[mid + 1] != nums[mid])
                    return mid;
                else low = mid + 1;
            } else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

}
