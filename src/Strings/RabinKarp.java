package Strings;

public class RabinKarp {

    private static void RabinKarp(String txt, String pat) {
        final int d = 256;//set of chars
        final int q = 101;//modulo prime no
        int pl = pat.length();
        int tl = txt.length();
        //TODO compute (d^(pl-1))%q i.e 1st digit multiplier
        int h = 1;
        for (int i = 1; i < pl; i++)
            h = (h * d) % q;
        //TODO calc hash for the pat and the first window
        int p = 0, t = 0;
        for (int i = 0; i < pl; i++) {
            p = (p * d + pat.charAt(i)) % q;
            t = (t * d + txt.charAt(i)) % q;
        }
        //TODO comparison
        for (int i = 0; i <= (tl - pl); i++) {
            //TODO pattern and text matches then check each chars
            if (p == t) {
                boolean flag = true;
                for (int j = 0; j < pl; j++)
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        flag = false;
                        break;
                    }
                if (flag) System.out.println(i);
            }
            //TODO shift window
            if (i < tl - pl) {
                //del the first char of prev win and then add last elem of curr win
                t = ((t - (txt.charAt(i) * h)) * d + txt.charAt(i + pl)) % q;
                if (t < 0) t += q;
            }
        }
    }

}
