package Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWith0sum {
    private static boolean subarrayWith0Sum(int[] nums) {
        int prev_sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            prev_sum += i;
            if (set.contains(prev_sum) || prev_sum == 0) return true;
            else set.add(prev_sum);
        }
        return false;


    }
}
