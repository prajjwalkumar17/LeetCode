package Graph;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int nofV = 5;
        int source = 0;
        for (int i = 0; i < nofV; i++)
            list.add(new ArrayList<Integer>());
        addEdge(list, 0, 1);
        addEdge(list, 0, 2);
        addEdge(list, 1, 2);
        addEdge(list, 3, 4);
        DFS(list, nofV);
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

    private static void DFS(ArrayList<ArrayList<Integer>> list, int nofV) {
        boolean[] visited = new boolean[nofV];
        for (int i = 0; i < nofV; i++) {
            if (!visited[i])
                dfsREC(list, i, visited);
        }
    }

    private static void dfsREC(ArrayList<ArrayList<Integer>> list, int source, boolean[] visited) {
        visited[source] = true;
        System.out.println(source + " ");
        for (int u : list.get(source)) {
            if (!visited[u])
                dfsREC(list, u, visited);
        }
    }
}
