package Sorting;

import java.util.Arrays;

public class MeetMaxGuest {
    int[] arr = new int[]{800, 700, 600, 500};
    int[] dep = new int[]{840, 820, 830, 530};

    //        System.out.println((noOfGuestsCanBeMeet(arr,dep)));
    private static int noOfGuestsCanBeMeet(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int res = 1;
        int count = 1;
        int i = 1, j = 0;
        while (i < arr.length && j < dep.length) {
            if (arr[i] <= dep[j]) {
                count++;
                i++;
            } else {
                count--;
                j++;
            }
            res = Math.max(res, count);
        }
        return res;
    }

}
