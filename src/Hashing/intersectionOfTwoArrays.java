package Hashing;

import java.util.HashSet;
import java.util.Set;

public class intersectionOfTwoArrays {
    private static int findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1)
            set.add(i);
        int count = 0;
        for (int i : nums2) {
            if (set.contains(i)) {
                count++;
                set.remove(i);
            }
        }
        return count;
    }
}
