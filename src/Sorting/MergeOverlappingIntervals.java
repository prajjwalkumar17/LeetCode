package Sorting;

import java.util.Arrays;

public class MergeOverlappingIntervals {
    private static void mergeIntervals(Pair[] pairs) {
        Arrays.sort(pairs);
        for (Pair p : pairs)
            System.out.println("[" + p.start + "," + p.end + "]");
        System.out.println("✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅");
        int res = 0;
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i].start <= pairs[res].end) {
                pairs[res].end = Math.max(pairs[i].end, pairs[res].end);
                pairs[res].start = Math.min(pairs[i].start, pairs[res].start);
            } else {
                res++;
                pairs[res] = pairs[i];
            }
        }
        for (int i = 0; i <= res; i++)
            System.out.println("[" + pairs[i].start + "," + pairs[i].end + "]");
    }
}

class Pair implements Comparable<Pair> {
    int start;
    int end;

    public Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public int compareTo(Pair o) {
        return this.start - o.start;
    }
}