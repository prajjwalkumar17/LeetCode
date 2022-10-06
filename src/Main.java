import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int nofV = 5;
        for (int i = 0; i < nofV; i++)
            list.add(new ArrayList<Integer>());
        addEdge(list, 0, 2);
        addEdge(list, 0, 3);
        addEdge(list, 1, 3);
        addEdge(list, 1, 4);
        addEdge(list, 2, 3);
        topologicalSort(list, nofV);
    }

    private static void topologicalSort(ArrayList<ArrayList<Integer>> list, int nofV) {
        int inDegree[] = new int[nofV];
        for (int u = 0; u < nofV; u++)
            for (int node : list.get(u))
                inDegree[node]++;

        Queue<Integer> q = new LinkedList<>();
        //Adding all the 0 indegree nodes to q at beginning
        for (int i = 0; i < nofV; i++)
            if (inDegree[i] == 0)
                q.add(i);

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");
            for (int i : list.get(curr))
                if (--inDegree[i] == 0)
                    q.add(i);
        }

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






