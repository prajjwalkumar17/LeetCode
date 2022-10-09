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
        int edgeTo;
        int weight;

        public Node(int vertex, int edgeTo, int weight) {
            this.vertex = vertex;
            this.edgeTo = edgeTo;
            this.weight = weight;
        }

        public int getVertex() {
            return vertex;
        }

        public int getEdgeTo() {
            return edgeTo;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "vertex=" + vertex +
                    ", edgeTo=" + edgeTo +
                    ", weight=" + weight +
                    '}';
        }
    }
    static class Graph {
        Map<Integer, List<Node>> mp = null;
        public Graph() {
            mp = new LinkedHashMap<>();
        }
        public boolean addEdge(int u, int v, int w) {
            if (!mp.containsKey(u))
                mp.put(u, new LinkedList<>());
            mp.get(u).add(new Node(u, v, w));
            return true;
        }
        @Override
        public String toString() {
            StringBuilder data = new StringBuilder();
            for (int key : mp.keySet()) {
                for (Node value : mp.get(key))
                    data.append(value.getEdgeTo()).append(" ");
                data.append("\n");

            }
            return data.toString();
        }
    }

}
