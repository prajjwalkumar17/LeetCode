package Hashing;

public class SubarraySameIndexedSum {
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
