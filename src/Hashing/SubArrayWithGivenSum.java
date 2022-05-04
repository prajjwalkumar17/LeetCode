package Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {
    private static boolean subarrayWithGivenSum(int[] num, int sum) {
        var prev_sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : num) {
            prev_sum += i;
            if (set.contains(prev_sum - sum) || prev_sum == sum) return true;
            else set.add(prev_sum);
        }
        return false;
    }
}
