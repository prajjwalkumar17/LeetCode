package Array;

public class MaximumSUmCircularSUbArray {
    private static int MaxCircularSubarrayNAIVE(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int totalIndexMax = arr[i];
            int currSum = arr[i];
            for (int e = 1; e < arr.length; e++) {
                int index = (i + e) % arr.length;
                currSum += arr[index];
                totalIndexMax = Math.max(totalIndexMax, currSum);
            }
            res = Math.max(res, totalIndexMax);
        }
        return res;
    }

    private static int MaxCircularSubarrayEFFF(int[] arr) {
        //kaden to find max sum of normal subarray
        //total array sum - min normal subarray sum kaden
        //max of these two is req answer
        int maxNormalSubarray = kadenMax(arr);
        if (maxNormalSubarray < 0) return maxNormalSubarray;
        int minNormalSubarray = kadenMin(arr);
        int totalArraySum = totalArraySum(arr);
        int reqMaxCircularSubArray = totalArraySum - minNormalSubarray;
        return Math.max(maxNormalSubarray, reqMaxCircularSubArray);

    }

    private static int totalArraySum(int[] arr) {
        int sum = 0;
        for (int iter : arr)
            sum += iter;
        return sum;
    }

    private static int kadenMax(int[] arr) {
        int res = arr[0];
        int curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(curr + arr[i], arr[i]);
            res = Math.max(res, curr);
        }
        return res;
    }

    private static int kadenMin(int[] arr) {
        int res = arr[0];
        int curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.min(curr + arr[i], arr[i]);
            res = Math.min(res, curr);
        }
        return res;
    }


}
