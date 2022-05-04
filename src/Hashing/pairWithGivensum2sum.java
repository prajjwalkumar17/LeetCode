package Hashing;

import java.util.HashSet;
import java.util.Set;

public class pairWithGivensum2sum {
    private static boolean pairWithGivenSum(int[] nums1, int n) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            if (set.contains(n - i)) return true;
            else set.add(i);
        }
        return false;
    }
}
