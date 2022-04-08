package Strings;

public class isValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]--;
            count[t.charAt(i)]++;
        }
        for (int i : count) if (i > 0) return false;
        return true;
    }

}
