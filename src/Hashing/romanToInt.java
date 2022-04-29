package Hashing;

import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    public static int romantoint(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            int curr = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));
            res = curr < next ? res - curr : res + curr;
        }

        //AS it goes only upto second last position
        return res + map.get(s.charAt(s.length() - 1));

    }

}
