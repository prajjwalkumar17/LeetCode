package Hashing;

import java.util.HashMap;
import java.util.Map;

public class NoOfPairsWithGivenSum {
    //    https://leetcode.com/problems/max-number-of-k-sum-pairs/
    private static int NoOfpairWithGivenSum(int[] nums1, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums1) {
            if (map.containsKey(k - i) && map.get(k - i) > 0) {
                map.put(k - i, map.get(k - i) - 1);
                count++;
            } else map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return count;
    }
}
