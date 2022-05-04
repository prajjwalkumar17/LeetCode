import jdk.jfr.Label;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        int[] nums1 = new int[]{2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2};
        int n = 3;
        System.out.println(pairWithGivenSum(nums1, n));


    }

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

