package Graph;

import java.util.*;

public class SelfMadeGraph {
    static Scanner sc = new Scanner(System.in);
    static List<Integer> adj = new ArrayList<>(1000001);

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(15, 16, 1);
        g.addEdge(16, 17, 2);
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
            mp = new HashMap<>();
        }

        public boolean addEdge(int u, int v, int w) {
            if (!mp.containsKey(u))
                mp.put(u, new LinkedList<>());
            mp.get(u).add(new Node(u, v, w));
            return true;
        }

        @Override
        public String toString() {
            String data = "";
            for (Map.Entry<Integer, List<Node>> pair : mp.entrySet())
                data += pair.getKey() + "=>   {" + pair.getValue() + "  }";
            return data;
        }
    }

}
