package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topologicalSort {
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
}
