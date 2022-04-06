package Array;

import java.util.HashMap;

public class Sum2 {

    private static int[] Sum2(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i]))
                return new int[]{map.get(target - arr[i]), i};
            else
                map.put(arr[i], i);
        }
        return new int[]{};
    }
}
