package Recursion;

public class StringPallindrome {

    public static boolean checkPallindrome(String s, int low, int high) {
        if (low >= high) return true;
        return (s.charAt(low) == s.charAt(high) && checkPallindrome(s, low + 1, high - 1));
    }


}
