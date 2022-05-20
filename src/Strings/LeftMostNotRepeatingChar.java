package Strings;

public class LeftMostNotRepeatingChar {
    static final int CHAR = 256;

    private static int leftMostRepeatingcharBETTER(String s1) {
        int[] count = new int[CHAR];
        for (char o : s1.toCharArray())
            count[o]++;

        for (int i = 0; i < s1.length(); i++)
            if (count[s1.charAt(i)] == 1) return i;
        return -1;
    }
}
