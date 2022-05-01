package LeetCodeChallenge.Weekly291;

import java.math.BigInteger;

public class RemoveDigitToMaxResult2259 {
    //https://leetcode.com/contest/weekly-contest-291/problems/remove-digit-from-number-to-maximize-result/
    private static void removetogetMax(String number, char digit) {
//        import java.math.BigInteger;
        String res = String.valueOf(Integer.MIN_VALUE);
        for (int i = 0; i < number.length(); i++) {
            StringBuilder str = new StringBuilder(number);
            if (str.charAt(i) == digit) {
                String ans = str.deleteCharAt(i).toString();
                System.out.println(ans);
                BigInteger resold = new BigInteger(res);
                BigInteger resnew = new BigInteger(ans);
                res = (String.valueOf(resold.compareTo(resnew)).equals("-1")) ? ans : res;
            }
        }
        System.out.println(res);
    }
}
