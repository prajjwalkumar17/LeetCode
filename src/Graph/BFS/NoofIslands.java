package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NoofIslands {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < v; i++)
            list.add(new ArrayList<Integer>());
        addEdge(list, 0, 1);
        addEdge(list, 0, 2);
        addEdge(list, 1, 3);
        addEdge(list, 1, 0);
        addEdge(list, 2, 0);
        addEdge(list, 2, 3);
        addEdge(list, 4, 5);
        addEdge(list, 4, 6);
        addEdge(list, 5, 6);
        addEdge(list, 5, 4);
        addEdge(list, 6, 4);
        addEdge(list, 6, 5);
        System.out.println(BFSDiff(list, v));
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }

    public static int BFSDiff(ArrayList<ArrayList<Integer>> list, int v) {
        int count = 0;
        boolean visited[] = new boolean[v + 1];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                count++;
                bfs(list, visited, v, i);
            }
        }
        return count;
    }

    private static void bfs(ArrayList<ArrayList<Integer>> list, boolean[] visited, int v, int i) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = true;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int j : list.get(u)) {
                if (!visited[j]) {
                    q.add(j);
                    visited[j] = true;
                }

            }

        }
    }
}
