package Strings;

public class LongestSubStringDistinct {
    private static int longestDistinctNAIVE(String txt) {
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
