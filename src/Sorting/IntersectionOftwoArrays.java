package Sorting;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOftwoArrays {

    public static void intersection(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (i > 0 && nums1[i] == nums1[i - 1]) {
                i++;
                continue;
            }
            if (nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) i++;
            else if (nums1[i] > nums2[j]) j++;
        }
        Integer[] ewsa = res.toArray(new Integer[0]);
    }
}
