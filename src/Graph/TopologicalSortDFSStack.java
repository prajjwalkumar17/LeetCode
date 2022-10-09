package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortDFSStack {
    public static void topologicalSort(ArrayList<ArrayList<Integer>> list, int nofV) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[nofV];
        for (int i = 0; i < nofV; i++)
            if (!visited[i])
                DFS(list, visited, stack, i);
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }

    private static void DFS(ArrayList<ArrayList<Integer>> list, boolean[] visited, Stack<Integer> stack, int source) {
        visited[source] = true;
        for (int neighbour : list.get(source))
            if (!visited[neighbour])
                DFS(list, visited, stack, neighbour);

        stack.push(source);
    }
}
