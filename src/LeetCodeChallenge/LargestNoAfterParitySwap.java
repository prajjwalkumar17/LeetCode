package LeetCodeChallenge;

import java.util.Arrays;

//You are given a positive integer num. You may swap any two digits of num that have the same parity (i.e. both odd digits or both even digits).
//
//        Return the largest possible value of num after any number of swaps.
//
//
//        Input: num = 1234
//        Output: 3412
//        Explanation: Swap the digit 3 with the digit 1, this results in the number 3214.
//        Swap the digit 2 with the digit 4, this results in the number 3412.
//        Note that there may be other sequences of swaps but it can be shown that 3412 is the largest possible number.
//        Also note that we may not swap the digit 4 with the digit 1 since they are of different parities.
//
//        Input: num = 65875
//        Output: 87655
//        Explanation: Swap the digit 8 with the digit 6, this results in the number 85675.
//        Swap the first digit 5 with the digit 7, this results in the number 87655.
//        Note that there may be other sequences of swaps but it can be shown that 87655 is the largest possible number.
public class LargestNoAfterParitySwap {
    public static void largestInteger(int num) {
        String temp = Integer.toString(num);
        int[] nums = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
            nums[i] = temp.charAt(i) - '0';
        int res = num;
        int presentNum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] % 2 == 0) {
                    if (nums[j] % 2 == 0)
                        nums = swapArray(nums, i, j);
                } else {
                    if (nums[j] % 2 != 0)
                        nums = swapArray(nums, i, j);
                }
                presentNum = Integer.parseInt(Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", ""));
                res = Math.max(res, presentNum);
                if (presentNum != res)
                    nums = swapArray(nums, j, i);
            }
        }
        System.out.println(res);
    }

    private static int[] swapArray(int[] nums, int i, int j) {
        int temp1 = nums[j];
        nums[j] = nums[i];
        nums[i] = temp1;
        return nums;
    }

}
