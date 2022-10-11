import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int nofV = 6;
        int source = 0;
        for (int i = 0; i < nofV; i++)
            list.add(new ArrayList<Integer>());
        addEdge(list, 0, 1);
        addEdge(list, 0, 4);
        addEdge(list, 4, 5);
        addEdge(list, 4, 2);
        addEdge(list, 1, 2);
        addEdge(list, 2, 3);
        addEdge(list, 5, 3);
        System.out.println(topologicalSort(list, nofV).toString());

    }

    private static List<Integer> topologicalSort(ArrayList<ArrayList<Integer>> list, int nofV) {
        boolean[] visited = new boolean[nofV];
        Stack<Integer> s = new Stack<Integer>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nofV; i++)
            if (!visited[i])
                topologicalSort(list, visited, s, i);
        while (!s.isEmpty())
            result.add(s.pop());
        return result;
    }

    private static void topologicalSort(ArrayList<ArrayList<Integer>> list, boolean[] visited, Stack<Integer> s, int source) {
        visited[source] = true;
        for (int neighbour : list.get(source)) {
            if (!visited[neighbour])
                topologicalSort(list, visited, s, neighbour);
        }
        s.push(source);
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
    }
}






