package Miscelleneous;

import java.util.Arrays;

public class LastStoneWait1046 {


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
