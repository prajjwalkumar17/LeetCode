package Array;

import java.util.*;

//Given an integer array nums and an integer k,
// return the k most frequent elements. You may return the answer in any order.
//        Example 1:
//
//        Input: nums = [1,1,1,2,2,3], k = 2
//        Output: [1,2]
//        Example 2:
//
//        Input: nums = [1], k = 1
//        Output: [1]
public class TopKFrequentElement {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }
        List<Pair> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(new Pair(entry.getKey(), entry.getValue()));
        }
        Collections.sort(list);
        int[] res = new int[k];
        int count = 0;
        for (Pair p : list) {
            res[count++] = p.value;
            k--;
            if (k == 0) break;
        }

        return res;

    }

    static class Pair implements Comparable<Pair> {
        int value;
        int freq;

        public Pair(int value, int freq) {
            this.value = value;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.freq < o.freq) return 1;
            if (this.freq == o.freq) {
                if (this.value < o.value) return 1;
                else return -1;
            }
            return -1;
        }
    }
}
