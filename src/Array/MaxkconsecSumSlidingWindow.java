package Array;

import java.util.ArrayList;
import java.util.List;

public class MaxkconsecSumSlidingWindow {
    private static int SlidingWindowEFF(int[] arr, int k) {
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }
        int res = currSum;
        for (int j = k; j < arr.length; j++) {
            currSum += (arr[j] - arr[j - k]);
            res = Math.max(res, currSum);
        }
        return res;
    }


    private static int SlidingWindowNAIVE(int[] arr, int k) {
        int res = 0;
        for (int i = 0; i < arr.length - k; i++) {
            int sum = arr[i];
            for (int l = i + 1; l < i + k; l++) {
                sum += arr[l];
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}
