package Graph.CycleDetection;

import java.util.ArrayList;

public class CycleDirected {
    private static boolean detectCycleDIR(ArrayList<ArrayList<Integer>> list, int nofV) {
        boolean[] visited = new boolean[nofV];
        boolean[] recurring = new boolean[nofV];
        for (int i = 0; i < nofV; i++)
            if (!visited[i])
                if (detectCycle(list, i, visited, recurring)) return true;
        return false;
    }

    private static boolean detectCycle(ArrayList<ArrayList<Integer>> list, int source, boolean[] visited, boolean[] recurring) {
        visited[source] = true;
        recurring[source] = true;
        for (int neighbour : list.get(source)) {
            if (!visited[neighbour] && detectCycle(list, neighbour, visited, recurring))
                return true;
            else if (recurring[neighbour]) return true;
        }
        recurring[source] = false;
        return false;
    }
}
