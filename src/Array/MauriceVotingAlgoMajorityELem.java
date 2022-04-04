package Array;

public class MauriceVotingAlgoMajorityELem {


    private static int majorityEFF(int[] arr) {
        int res = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[res] == arr[i]) count++;
            else count--;
            if (count == 0) {
                count++;
                res = i;
            }
        }
        if (checkMauriceAlgo(res, arr)) return res;
        return -1;
    }

    private static boolean checkMauriceAlgo(int res, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[res] == arr[i]) count++;
        }
        if (count > arr.length / 2) return true;
        return false;
    }

    private static int majorityNAIVE(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) count++;
            }
            if (count > arr.length / 2)
                return i;
        }
        return -1;
    }


}
