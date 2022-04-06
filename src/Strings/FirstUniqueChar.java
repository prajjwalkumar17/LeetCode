package Strings;

import java.util.Arrays;

public class FirstUniqueChar {


    public static int firstUniqChar(String s) {
        int CHAR = 256;
        int[] listOfChars = new int[CHAR];
        Arrays.fill(listOfChars, -1);
        for (int i = 0; i < s.length(); i++) {
            if (listOfChars[s.charAt(i)] == -1)
                listOfChars[s.charAt(i)] = i;
            else
                listOfChars[s.charAt(i)] = -2;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (listOfChars[i] >= 0)
                res = Math.min(res, listOfChars[i]);
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }


    private static int firstUniqueChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(String.valueOf(s.charAt(i))) == s.lastIndexOf(String.valueOf(s.charAt(i)))) {
                return i;
            }
        }
        return -1;
    }
}
