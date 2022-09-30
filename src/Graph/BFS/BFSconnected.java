package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSconnected {
    private static void bfsTraversal(ArrayList<ArrayList<Integer>> list, int v, int s) {
        Queue<Integer> q = new LinkedList<Integer>();
        boolean visited[] = new boolean[v + 1];
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.println(u + " ");
            for (int n : list.get(u)) {
                if (visited[n] != true) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }

    }
}
