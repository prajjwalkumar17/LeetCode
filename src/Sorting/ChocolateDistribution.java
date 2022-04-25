package Sorting;

import java.util.Arrays;

public class ChocolateDistribution {
//    //TODO Pick m packets such that diff between the high and low is min
//    int[] num=new int[]{7,3,2,4,9,12,56};
//    int m=3;
//    minDifference
//    (num,m);


    private static void minDifference(int[] arr, int m) {
        Arrays.sort(arr);
        int res = arr[m - 1] - arr[0];
        for (int i = 1; i + m - 1 < arr.length; i++) {
            res = Math.min(res, arr[i + m - 1] - arr[i]);
        }
        System.out.println(res);

    }


}
