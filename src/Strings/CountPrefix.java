package Strings;

import java.util.HashMap;
import java.util.Map;

public class CountPrefix {
    private static void countPrefixes(String[] words, String s) {
//        String[] words=new String[]{"a","a"};
//        String s="aa";
//        countPrefixes(words,s);
        Map<String, Integer> map = new HashMap<>();
        for (String str : words) {
            if (!map.containsKey(str)) map.put(str, 1);
            else map.put(str, map.get(str) + 1);
        }
        int count = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (map.containsKey(s.substring(0, i))) {
                count += map.get(s.substring(0, i));
            }
        }

//        System.out.println(count);
    }
}
