import jdk.jfr.Label;

import java.util.*;


public class Main {
    static final int CHAR = 256;

    public static void main(String[] args) {
        String txt = "abacd";
        longestDistinct(txt);
    }

    private static int longestDistinct(String txt) {
        int res = 0;
        int n = txt.length();
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];
            for (int j = i; j < n; j++) {
                if (visited[txt.charAt(j)]) break;
                else {
                    res = Math.max(res, j - i + 1);
                    visited[txt.charAt(j)] = true;
                }
            }
        }
        return res;
    }


}




