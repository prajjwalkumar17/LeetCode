import jdk.jfr.Label;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        int[] nums1 = new int[]{2, 6, 2, 2, 3, 5, 1, 5};
        int n = 82;
        System.out.println(pairWithGivenSum(nums1, n));


    }

    private static boolean pairWithGivenSum(int[] nums1, int n) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            if (set.contains(n - i)) return true;
            else set.add(i);
        }
        return false;
    }


}

