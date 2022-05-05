package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithGivenSum {

    private static int longestSubarrayWithGivenSumEFF(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        int accumulator = 0, maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            accumulator += arr[i];
            //Check if accum is sum then no comp needed it will be biggest in present
            if (accumulator == sum) maxLength = i + 1;
            if (map.containsKey(accumulator - sum))
                maxLength = Math.max(maxLength, i - map.get(accumulator - sum));
            //Don't replace the old key value add only if previously it isn't present
            if (!map.containsKey(accumulator))
                map.put(accumulator, i);
        }
        System.out.println(maxLength);
        return maxLength;
    }


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
