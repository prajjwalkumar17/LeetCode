package LeetCodeChallenge;

import java.util.HashMap;
import java.util.Map;

public class MinimumRoundspriorityto3over2 {
    //2244
//    Input: tasks = [2,2,3,3,2,4,4,4,4,4]
//    Output: 4
//    Explanation: To complete all the tasks, a possible plan is:
//            - In the first round, you complete 3 tasks of difficulty level 2.
//            - In the second round, you complete 2 tasks of difficulty level 3.
//            - In the third round, you complete 3 tasks of difficulty level 4.
//            - In the fourth round, you complete 2 tasks of difficulty level 4.
//    It can be shown that all the tasks

    public static int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tasks) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        System.out.println(map);

        int res = 0;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() < 2) {
                return -1;
            }
            int noof3req = pair.getValue() / 3;
            int remainingaftr3 = pair.getValue() % 3;
            if (remainingaftr3 == 1) noof3req -= 1;
            int noof2req = (pair.getValue() - (3 * noof3req)) / 2;
            res += noof3req + noof2req;
        }
        return res;

    }
}
