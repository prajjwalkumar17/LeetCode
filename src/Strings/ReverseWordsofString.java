package Strings;

public class ReverseWordsofString {
    public static String reverseWordsInString(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        int start = 0;
        char[] chr = s.toCharArray();
        for (int end = 0; end < s.length(); end++) {
            if (chr[end] == ' ') {
                reverse(chr, start, end - 1);
                start = end + 1;
            }
        }
        reverse(chr, start, s.length() - 1);
        reverse(chr, 0, s.length() - 1);
        return new String(chr);
    }

    private static void reverse(char[] chr, int start, int end) {
        while (start <= end) {
            char temp = chr[start];
            chr[start] = chr[end];
            chr[end] = temp;
            start++;
            end--;
        }
    }
}
