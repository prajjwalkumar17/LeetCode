package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j])
                j++;
            else
                i++;
        }
        int[] arr = new int[res.size()];
        for (int k = 0; k < res.size(); k++) {
            arr[k] = res.get(k);
        }
        return arr;
    }
}
