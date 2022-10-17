package Graph;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PrimsAlgo {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(1, 2, 5);
        g.addEdge(1, 3, 8);
        g.addEdge(2, 4, 15);
        g.addEdge(2, 3, 10);
        g.addEdge(3, 4, 20);
        primsAlgo(g.getMap());

    }

    private static void primsAlgo(Map<Integer, List<Node>> map) {
    }


    //TODO Graph HashMap implementation
    @Data
    @AllArgsConstructor
    static class Node implements Comparable<Node> {
        private int vertex;
        private int edgeTo;
        private int weight;

        @Override
        public int compareTo(Node o) {
            return 0;
        }
    }

    static class Graph {
        private Map<Integer, List<Node>> mp;

        public Graph() {
            mp = new TreeMap<>();
        }

        public Map<Integer, List<Node>> getMap() {
            return mp;
        }

        public void addEdge(int vertex, int edgeTo, int weight) {
            if (!mp.containsKey(vertex))
                mp.put(vertex, new LinkedList<>());
            else if (!mp.containsKey(edgeTo))
                mp.put(edgeTo, new LinkedList<>());
            mp.get(vertex).add(new Node(vertex, edgeTo, weight));
        }
    }
}
