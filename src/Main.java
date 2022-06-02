import jdk.jfr.Label;

import java.util.*;


public class Main {
    static final int CHAR = 256;

    public static void main(String[] args) {
        String txt = "abdabcbabc";
        String pat = "abc";
        checkPat(txt, pat);

    }

    private static void checkPat(String txt, String pat) {
        int d = 10;
        int q = 101;
        int pl = pat.length();
        int tl = txt.length();
        //TODO first we will find h
        int h = 1;
        for (int i = 1; i < pl; i++)
            h *= d;
        System.out.println(h);
    }


}




