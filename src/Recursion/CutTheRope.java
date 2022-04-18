package Recursion;

public class CutTheRope {


    static int cutTheRope(int n, int a, int b, int c) {
        if (n == 0) return 0;
        if (n < 0) return -1;

        int res = Math.max(cutTheRope(n - a, a, b, c),
                Math.max(cutTheRope(n - b, a, b, c),
                        cutTheRope(n - c, a, b, c)));
        if (res == -1) return -1;
        return res + 1;
    }
}
