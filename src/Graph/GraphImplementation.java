package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphImplementation {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int v = 5;
        for (int i = 0; i < v; i++)
            list.add(new ArrayList<Integer>());
        addEdge(0, 1, list);
        addEdge(0, 2, list);
        addEdge(1, 2, list);
        addEdge(1, 3, list);
        showGraph(list);

    }


    private static void showGraph(ArrayList<ArrayList<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++)
                System.out.println(list.get(i).get(j));
            System.out.println();
        }
    }

    public static void addEdge(int u, int v, ArrayList<ArrayList<Integer>> list) {
        list.get(u).add(v);
        list.get(v).add(u);
    }
}
