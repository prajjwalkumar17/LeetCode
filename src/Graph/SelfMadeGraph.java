package Graph;

import java.util.*;

public class SelfMadeGraph {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0, 1, 2);
        g.addEdge(0, 4, 1);
        g.addEdge(1, 2, 3);
        g.addEdge(2, 3, 6);
        g.addEdge(4, 5, 4);
        g.addEdge(4, 2, 2);
        g.addEdge(5, 3, 1);
        System.out.println(g);
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
