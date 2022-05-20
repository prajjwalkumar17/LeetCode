package Strings;

import java.util.Arrays;

public class LeftMostNotRepeatingChar {
    static final int CHAR = 256;

    private static int leftMostRepeatingcharBEST(String s1) {
        int[] count = new int[CHAR];
        Arrays.fill(count, -1);
        for (int i = 0; i < s1.length(); i++) {
            if (count[s1.charAt(i)] == -1) count[s1.charAt(i)] = i;
            else count[s1.charAt(i)] = -2;
        }
        int res = Integer.MAX_VALUE;
        for (int i : count)
            if (i >= 0) res = Math.min(res, i);

        return (res == Integer.MAX_VALUE) ? -1 : res;
    }

    private static int leftMostRepeatingcharBETTER(String s1) {
        int[] count = new int[CHAR];
        for (char o : s1.toCharArray())
            count[o]++;

        for (int i = 0; i < s1.length(); i++)
            if (count[s1.charAt(i)] == 1) return i;
        return -1;
    }
}
