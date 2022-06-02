package Strings;

public class AnagramSearch {
    //EFF
    private static boolean anagramSearchEFF(String txt, String pat) {
        int CHAR = 256;
        int[] ct = new int[CHAR];
        int[] cp = new int[CHAR];
        for (int i = 0; i < pat.length(); i++) {
            ct[txt.charAt(i)]++;
            cp[pat.charAt(i)]++;
        }
        for (int i = pat.length(); i < txt.length(); i++) {
            if (same(ct, cp)) return true;
            //new char incountered
            ct[txt.charAt(i)]++;
            //first char of prev window
            ct[txt.charAt(i - pat.length())]--;
        }
        return false;
    }

    private static boolean same(int[] ct, int[] cp) {
        for (int i = 0; i < ct.length; i++)
            if (ct[i] != cp[i]) return false;
        return true;
    }


    //NAIVE
    private static boolean anagramSearch(String txt, String pat) {
        for (int i = 0; i < txt.length() - pat.length(); i++)
            if (isAnagram(txt, pat, i)) return true;
        return false;
    }

    private static boolean isAnagram(String txt, String pat, int j) {
        int CHAR = 256;
        int[] count = new int[CHAR];
        for (int i = 0; i < pat.length(); i++) {
            count[pat.charAt(i)]++;
            count[txt.charAt(i + j)]--;
        }
        for (int i : count)
            if (i != 0) return false;
        return true;
    }
}
