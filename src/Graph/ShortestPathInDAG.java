package Graph;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ShortestPathInDAG {

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0, 1, 2);
        g.addEdge(0, 4, 1);
        g.addEdge(4, 5, 4);
        g.addEdge(4, 2, 2);
        g.addEdge(1, 2, 3);
        g.addEdge(2, 3, 6);
        g.addEdge(5, 3, 1);
        shortestPathDAG(g.getMp());
    }

    private static void shortestPathDAG(Map<Integer, List<Node>> mp) {
        topologicalSort(mp);
    }

    public static void topologicalSort(Map<Integer, List<Node>> mp) {
        int[] visited = new int[mp.size()];
        for (int i = 0)

    }

    static class Node {
        int vertex;
        int weight;
        int edgeTo;
        public Node(int vertex, int edgeTo, int weight) {
            this.vertex = vertex;
            this.weight = weight;
            this.edgeTo = edgeTo;
        }

        public int getVertex() {
            return vertex;
        }

        public int getWeight() {
            return weight;
        }

        public int getEdgeTo() {
            return edgeTo;
        }
    }
    static class Graph {
        Map<Integer, List<Node>> mp = null;
        public Graph() {
            mp = new LinkedHashMap<>();
        }
        public void addEdge(int source, int dest, int weight) {
            if (!mp.containsKey(source))
                mp.put(source, new LinkedList<>());
            else if (!mp.containsKey(dest))
                mp.put(dest, new LinkedList<>());
            mp.get(source).add(new Node(source, dest, weight));
        }
        public Map<Integer, List<Node>> getMp() {
            return mp;
        }
    }
}
