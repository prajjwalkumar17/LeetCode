package LeetCodeChallenge.Biweekly77;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class minAvgDiff {
    private static int minavgDiff(int[] nums) {
        if (nums.length == 1) return 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        for (int it : nums)
            sum += it;

        int resultIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int beforeVal = 0, afterVal = 0;
            int beforeIter = 0;
            while (beforeIter <= i) {
                beforeVal += nums[beforeIter];
                beforeIter++;
            }

            afterVal = sum - beforeVal;


            try {
                afterVal = afterVal / (nums.length - i - 1);
            } catch (Exception e) {
                if (nums.length - i - 1 == 0) afterVal = 0;
            }

            beforeVal = beforeVal / (i + 1);
//            int diff=Math.abs(beforeVal-afterVal);

            int temp = res;
            res = Math.min(res, Math.abs(beforeVal - afterVal));
            resultIndex = temp == res ? resultIndex : i;
            System.out.println(resultIndex);
        }
        return resultIndex;
    }
//    int len = nums.length, res = 0;
//    long min = Integer.MAX_VALUE, sum = 0, leftSum = 0, rightSum = 0;
//	for (int num : nums)
//    sum += num;
//	for (int i = 0; i < len; i++) {
//        leftSum += nums[i];
//        rightSum = sum - leftSum;
//        long diff = Math.abs(leftSum / (i + 1) - (len - i == 1 ? 0 : rightSum / (len -i - 1)));
//        if (diff < min) {
//            min = diff;
//            res = i;
//        }
//    }
//	return res;

}
