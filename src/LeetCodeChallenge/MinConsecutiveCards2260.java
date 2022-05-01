package LeetCodeChallenge;

import java.util.HashMap;
import java.util.Map;

public class MinConsecutiveCards2260 {
    //    You are given an integer array cards where cards[i] represents the value of the
//    ith card. A pair of cards are matching if the cards have the same value.
//
//    Return the minimum number of consecutive cards you have to pick up to have a
//    pair of matching cards among the picked cards. If it is impossible to have matching
//    \cards, return -1.
//    https://leetcode.com/contest/weekly-contest-291/problems/minimum-consecutive-cards-to-pick-up/
    public static void minimumCardPickup(int[] cards) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < cards.length; i++) {
            if (!map.containsKey(cards[i])) map.put(cards[i], i);
            else {
                res = Math.min(res, (i - map.get(cards[i]) + 1));
                map.put(cards[i], i);
            }
        }

        res = res == Integer.MAX_VALUE ? -1 : res;
        System.out.println(res);
    }
}
