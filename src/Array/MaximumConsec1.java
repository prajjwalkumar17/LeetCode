package Array;

public class MaximumConsec1 {


    private static int maxConsec1Naive(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int currones = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 1) currones++;
                else break;
            }
            res = Math.max(res, currones);
        }
        return res;
    }

    private static int maxConsec1Eff(int[] arr) {
        int res = 0;
        int presentCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                res = Math.max(res, presentCount);
                presentCount = 0;
            } else {
                presentCount++;
            }
        }
        return res;
    }


}
