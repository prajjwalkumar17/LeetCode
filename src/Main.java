import jdk.jfr.Label;

import java.util.*;


public class Main {
    static final int CHAR = 256;

    public static void main(String[] args) {


//        int[] nums1 = new int[]{1, 3, 4, 3, 3, 2, 9, 10};
//        System.out.println(longestConsecutiveSubsequence(nums1));
        String s1 = "abccbda";
        System.out.println(leftMostRepeatingcharBEST(s1));

    }

    private static int leftMostRepeatingcharBEST(String s1) {
        int[] count = new int[CHAR];

    }


    private static int longestConsecutiveSubsequence(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 1;
        for (int n : nums) set.add(n);
        for (int i : nums) {
            if (!set.contains(i - 1)) {
                int curr = 1;
                while (set.contains(i + curr))
                    curr++;
                res = Math.max(res, curr);
            }
        }

        return res;
    }


}




