package Array;

import java.util.LinkedHashMap;

public class FrequencyInArray {

    public static void frequencyCount(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : arr) {
            Integer value = map.get(i);
            if (value == null)
                value = 1;
            else value += 1;

            map.put(i, value);
        }
        System.out.println(map);
    }

}
