package questions450;

/*Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1,
        compute how much water can be trapped between the blocks during the rainy season.


        Example 1:

        Input:
        N = 6
        arr[] = {3,0,0,2,0,4}
        Output:
        10
        Explanation:*/

public class TrappingRainwaterProblem {


    private static int MaximumRainwaternaive(int[] arr) {
        int result = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int lMax = arr[i];
            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]);
            }
            int rMax = arr[i];
            for (int k = i + 1; k < arr.length; k++) {
                rMax = Math.max(arr[k], rMax);
            }
            result += Math.min(lMax, rMax) - arr[i];
        }
        return result;
        //O(n^2)
    }

    private static int MaximumRainwaterEfficient(int[] nums) {
        int result = 0;
        int[] lMax = new int[nums.length];
        lMax[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            lMax[i] = Math.max(lMax[i - 1], nums[i]);
        }
        int[] rMax = new int[nums.length];
        rMax[nums.length - 1] = nums[nums.length - 1];
        for (int j = nums.length - 2; j >= 0; j--) {
            rMax[j] = Math.max(nums[j], rMax[j + 1]);
        }
        for (int k = 1; k < nums.length - 1; k++) {
            result += Math.min(lMax[k], rMax[k]) - nums[k];
        }
        return result;

        //@(n)
        //@(n)
    }

}
