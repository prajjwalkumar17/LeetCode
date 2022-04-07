package Miscelleneous;

import java.util.Arrays;

public class LastStoneWait1046 {
//    we just need to traverse array once and need to update the elements in the manner that
//    if two max nos are match then make them 0 if not then make the least of two as 0 and the
//    max one as diff of both and sort the array after each iteration so as to bring zeros to starting
//You are given an array of integers stones where stones[i] is the weight of the ith stone.
//
//    We are playing a game with the stones. On each turn, we choose the heaviest two stones and
//    smash them together. Suppose the heaviest two stones have weights x and y with x <= y.
//    The result of this smash is:
//
//    If x == y, both stones are destroyed, and
//    If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
//
//            Input: stones = [2,7,4,1,8,1]
//    Output: 1
//    Explanation:
//    We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
//    we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
//    we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
//    we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.
public int lastStoneWeight(int[] stones) {
    Arrays.sort(stones);
    int count = stones.length - 1;
    while (count != 0) {
        if (stones[stones.length - 1] == stones[stones.length - 2])
            stones[stones.length - 1] = stones[stones.length - 2] = 0;
        if (stones[stones.length - 1] != stones[stones.length - 2]) {
            stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
            stones[stones.length - 2] = 0;
        }
            Arrays.sort(stones);
            count--;
        }
        for (int i : stones) {
            if (i != 0) return i;
        }

        return 0;

    }


}
