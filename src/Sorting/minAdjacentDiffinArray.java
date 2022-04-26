package Sorting;

import java.util.Arrays;

public class minAdjacentDiffinArray {
    private static int minAdjDiff(int[] num) {
        int res = Integer.MAX_VALUE;
        Arrays.sort(num);
        for (int i = 0; i + 1 < num.length; i++) {
            res = Math.min(res, num[i + 1] - num[i]);
        }
        return res;
    }

}
