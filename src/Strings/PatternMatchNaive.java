package Strings;

public class PatternMatchNaive {
    private static void matchPatternNaive(String txt, String pat) {
        int m = pat.length();
        int n = txt.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (pat.charAt(j) != txt.charAt(i + j))
                    break;
            if (j == m) System.out.print(i + " ");
        }
    }

    //if pat is distinct
    private static void matchPatternNaiveOptimized(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        for (int i = 0; i <= n - m; ) {
            int j;
            for (j = 0; j < m; j++)
                if (pat.charAt(j) != txt.charAt(i + j))
                    break;
            if (j == m) System.out.println(i + " ");
            if (j == 0) i++;
            else i += j;
        }
    }


}
