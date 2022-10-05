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
        addEdge(list, 0, 1);
        addEdge(list, 1, 2);
        addEdge(list, 2, 3);
        addEdge(list, 3, 4);
        System.out.println(detectCycle(list, nofV));
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
}






