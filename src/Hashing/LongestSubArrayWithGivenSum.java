package Hashing;

public class LongestSubArrayWithGivenSum {
    private static int longestSubarrayWithGivenSumNAIVE(int[] arr, int sum) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < arr.length; j++) {
                curr_sum += arr[j];
                if (curr_sum == sum)
                    length = Math.max(length, j - i + 1);
            }
        }
        System.out.println(length);
        return length;
    }
}
