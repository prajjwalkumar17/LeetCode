package Strings;

public class Subsequence {
    //    String s1="ABCDE";
//    String s2="ABED";
//        System.out.println(isSubsequence(s1,s2,s1.length(),s2.length()));
    private static boolean isSubsequenceRECURSIVE(String s1, String s2, int n, int m) {
        if (m == 0) return true;
        if (n == 0) return false;
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) return isSubsequenceRECURSIVE(s1, s2, n - 1, m - 1);
        else isSubsequenceRECURSIVE(s1, s2, n - 1, m);
        return false;
    }


    private static boolean isSubsequenceITERATIVE(String s1, String s2) {
        int j = 0;
        for (int i = 0; i < s1.length() && j < s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(j)) j++;
        }

//        while(i<s1.length() && j<s2.length()){
//            if(s1.charAt(i)==s2.charAt(j)){
//                i++;j++;
//                continue;
//            }
//            i++;
//        }
        return j == s2.length();
    }
}
