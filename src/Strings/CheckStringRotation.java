package Strings;

public class CheckStringRotation {

//    String txt = "abcd";
//    String pat = "cdab";
//    System.out.println(checkRotaions(txt, pat));

    private static boolean checkRotaions(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return ((s1 + s1).indexOf(s2) >= 0);
    }
}
