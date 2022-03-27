package Array;

public class MaxmimumDifferencewithOrder {

    public static int maxdiffNaive(int[] arr) {
        int res = arr[1] - arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                res = Math.max(res, arr[j] - arr[i]);
            }
        }
        return res;
    }


    public static int maxdiffEfficient(int[] arr) {
        int currLow = arr[0];
        int result = arr[1] - currLow;
        for (int j = 1; j < arr.length; j++) {
            result = Math.max(result, arr[j] - currLow);
            currLow = Math.min(currLow, arr[j]);
        }
        return result;
    }


}
