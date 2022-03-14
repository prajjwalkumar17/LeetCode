package questions450;

/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

        A subarray is a contiguous part of an array.

        Example 1:
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.

        Example 2:
        Input: nums = [1]
        Output: 1

        Example 3:
        Input: nums = [5,4,-1,7,8]
        Output: 23*/

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] array1 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(MaximumSubarraynaive(array1));
    }


    private static int MaximumSubarraynaive(int[] nums) {
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int curr = 0;
            for (int j = i; j < nums.length; j++) {
                curr += nums[j];
                result = Math.max(result, curr);
            }
        }
        return result;
        //TIME Complexity = o(n^2)
    }


    //Kadaes approach
    private static int MaximumSubarraykaadane(int[] nums) {
        int result = nums[0];
        int curr = 0;
        for (int num : nums) {
            curr = Math.max(curr + num, num);
            result = Math.max(curr, result);
        }
        return result;
    }


}
