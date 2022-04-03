package Strings;
/*Given a string s, return true if the s can be palindrome after deleting at most one character from it.
Input: s = "aba"
        Output: true

        Input: s = "abca"
        Output: true
        Explanation: You could delete the character 'c'.*/

public class ValidPalindrome {

    private static boolean validPallindrone(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
        }
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else return false;
        }
        return true;
    }


}
