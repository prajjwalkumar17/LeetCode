package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class shortestPathfromSourceToAll {
    private static int[] shortestPath(ArrayList<ArrayList<Integer>> list, int nofV, int source) {
        int distance[] = new int[nofV];
        Arrays.fill(distance, Integer.MAX_VALUE);
        boolean visited[] = new boolean[nofV];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        distance[source] = 0;
        visited[source] = true;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int e : list.get(u)) {
                if (!visited[e]) {
                    distance[e] = distance[u] + 1;
                    visited[e] = true;
                    q.add(e);
                }
            }
        }
        return distance;
    }
}
