package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSdisconnected {

    public static void bfsDisconnected(ArrayList<ArrayList<Integer>> list, int v) {
        boolean visited[] = new boolean[v + 1];
        for (int i = 0; i < v; i++) {
            if (!visited[i])
                bfs(list, i, v, visited);
        }

    }

    private static void bfs(ArrayList<ArrayList<Integer>> list, int curr, int v, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        visited[curr] = true;
        q.add(curr);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.println(u + " ");
            for (int e : list.get(u)) {
                if (!visited[e]) {
                    q.add(e);
                    visited[e] = true;
                }
            }
        }

    }
}
