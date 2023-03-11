import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.*;

public class Solution {
    public int bfs(int[] arr, int c1, int c2) {
        int n = arr.length;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                graph.putIfAbsent(i, new ArrayList<>());
                graph.get(i).add(arr[i]);
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{c1, 1});
        queue.offer(new int[]{c2, 2});
        int[] vis = new int[n];
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int node = curr[0];
            int num = curr[1];
            if (vis[node] == 2 && num == 1 || vis[node] == 1 && num == 2) {
                return node;
            }
            if (vis[node] == num) {
                continue;
            }
            vis[node] = num;
            List<Integer> neighbors = graph.getOrDefault(node, new ArrayList<>());
            for (int nei : neighbors) {
                queue.offer(new int[]{nei, num});
            }
        }

        return -1;
    }
}
