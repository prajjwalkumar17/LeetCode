package Graph.CycleDetection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDirected2 {
    private static boolean cycleDetection2(ArrayList<ArrayList<Integer>> list, int nofV) {
        int inDegree[] = new int[nofV];
        int count = 0;

        //TODO constructing the indegree array
        for (int i = 0; i < nofV; i++)
            for (int u : list.get(i))
                inDegree[u]++;

        //Initializing queue and adding all indegree 0 in it
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < nofV; i++)
            if (inDegree[i] == 0)
                q.add(i);

        while (!q.isEmpty()) {
            int curr = q.poll();
            count++;
            for (int neighbour : list.get(curr))
                if (--inDegree[neighbour] == 0)
                    q.add(neighbour);


        }
        return count != nofV;
    }
}
