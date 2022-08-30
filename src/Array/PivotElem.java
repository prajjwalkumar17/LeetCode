package Array;

public class PivotElem {
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for (int j : nums) sum += j;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - nums[i] - leftSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
