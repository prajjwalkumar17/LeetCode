package Graph.CycleDetection;

import java.util.ArrayList;

public class CycleUndirected {
    private static boolean detectCycle(ArrayList<ArrayList<Integer>> list, int noofV) {
        boolean[] visited = new boolean[noofV];
        for (int i = 0; i < noofV; i++) {
            if (!visited[i]) {
                if (detectCycle(list, visited, i, -1)) return true;
            }
        }
        return false;
    }

    private static boolean detectCycle(ArrayList<ArrayList<Integer>> list, boolean[] visited, int source, int parent) {
        visited[source] = true;
        for (int u : list.get(source)) {
            if (!visited[u]) {
                if (detectCycle(list, visited, u, source)) return true;
            } else if (u != parent) return true;
        }
        return false;
    }
}
