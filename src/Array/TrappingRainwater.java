package Array;

public class TrappingRainwater {


    private static int trappingrainwaterEff(int[] arr) {
        int res = 0;
        int[] lMax = new int[arr.length];
        int[] rMax = new int[arr.length];

        lMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lMax[i] = Math.max(lMax[i - 1], arr[i]);
        }
        rMax[arr.length - 1] = arr[arr.length - 1];
        for (int j = arr.length - 2; j >= 0; j--) {
            rMax[j] = Math.max(rMax[j + 1], arr[j]);
        }

        for (int e = 0; e < arr.length; e++) {
            res += Math.min(lMax[e], rMax[e]) - arr[e];
        }
        return res;
    }

    private static int trappingrainwaterNaive(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int lMax = arr[i];
            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]);
            }
            int rMax = arr[i];
            for (int k = i + 1; k < arr.length; k++) {
                rMax = Math.max(rMax, arr[k]);
            }
            res += Math.min(lMax, rMax) - arr[i];
        }
        return res;
    }
}
