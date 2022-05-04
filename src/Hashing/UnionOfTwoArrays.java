package Hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    private static int unionOfArrays(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1)
            set.add(i);
        for (int i : nums2)
            set.add(i);
        return set.size();
    }
}
