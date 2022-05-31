package Hashing;

import java.util.*;

public class CountDistinctElements {
    private static void distinctElementInWindows(int[] nums1, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        var count = 0;
        for (int i = 0; i < k; i++) {
            if (map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i]) + 1);
            else {
                map.put(nums1[i], 1);
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < nums1.length - k; i++) {
            //TODO third case the element to  be deleted is last of its type
            if (map.get(nums1[i]) == 1) {
                map.remove(nums1[i]);
                count--;
            } else
                map.put(nums1[i], map.get(nums1[i]) - 1);

            //TODO first case that new element is already present don't inc update entry the count
            if (map.containsKey(nums1[k + i]))
                map.put(nums1[k + i], map.get(nums1[k + i]) + 1);
                //TODO second case the element is not present make a new entry & inc count
            else {
                map.put(nums1[k + i], 1);
                count++;
            }
            System.out.println(count);
        }
    }
}
