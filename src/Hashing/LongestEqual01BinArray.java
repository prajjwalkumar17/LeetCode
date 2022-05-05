package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestEqual01BinArray {
    //    int[] nums1 = new int[]{1,1,0,0,1,1,0,1};
//    int sum = 0;
    private static int LongestbinArray(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) arr[i] = -1;
        int length = 0;
        int accum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            accum += arr[i];
            if (!map.containsKey(accum)) map.put(accum, i);
            if (map.containsKey(accum - sum))
                length = Math.max(length, i - map.get(accum - sum));
            if (accum == sum) length = i + 1;
        }

        System.out.println(length);
        return length;
    }
}
