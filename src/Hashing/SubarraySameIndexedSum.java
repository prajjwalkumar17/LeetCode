package Hashing;

import java.util.HashMap;

public class SubarraySameIndexedSum {

    private static void subArraySameIndexedSumEFF(int[] nums1, int[] nums2) {

        //TODO make a diff array and then same as longest subarray with 0 sum
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] -= nums2[i];
        }
        int res = 0, accum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            accum += nums1[i];
            if (accum == 0) res = i + 1;
            if (map.containsKey(accum)) res = Math.max(res, i - map.get(accum));
            else map.put(accum, i);
        }
        System.out.println(res);

    }

    private static void subArraySameIndexedSumNAIVE(int[] nums1, int[] nums2) {
        int res = 0;
        for (int i = 0; i < nums1.length; i++) {
            int curr1 = 0;
            int curr2 = 0;
            for (int j = i; j < nums1.length; j++) {
                curr1 += nums1[j];
                curr2 += nums2[j];
                if (curr1 == curr2)
                    res = Math.max(res, j - i + 1);
            }
        }
        System.out.println(res);
    }
}
