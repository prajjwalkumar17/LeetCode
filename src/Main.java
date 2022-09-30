import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int v = 7;
        for (int i = 0; i < v; i++)
            list.add(new ArrayList<Integer>());
        addEdge(list, 0, 1);
        addEdge(list, 0, 2);
        addEdge(list, 1, 3);
        addEdge(list, 2, 3);
        addEdge(list, 4, 5);
        addEdge(list, 4, 6);
        addEdge(list, 5, 6);
//        printGraph(list,v);
        bfsDisconnected(list, v);

    }

    private static void printGraph(ArrayList<ArrayList<Integer>> list, int v) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++)
                System.out.println(list.get(i).get(j));
            System.out.println();
        }
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }

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






