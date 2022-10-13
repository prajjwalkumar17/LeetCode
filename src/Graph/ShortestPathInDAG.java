package Graph;

import java.util.*;

public class ShortestPathInDAG {

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0, 1, 2);
        g.addEdge(0, 4, 1);
        g.addEdge(1, 2, 3);
        g.addEdge(4, 2, 2);
        g.addEdge(4, 5, 4);
        g.addEdge(2, 3, 6);
        g.addEdge(5, 3, 1);
        shortestPathDAG(g.getMp());
    }

    private static void shortestPathDAG(Map<Integer, List<Node>> mp) {
        topologicalSort(mp);
    }

    public static void topologicalSort(Map<Integer, List<Node>> mp) {
        boolean[] visited = new boolean[100];
        int[] distance = new int[100];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;
        Stack<Integer> stack = new Stack<>();
        for (int source : mp.keySet())
            if (!visited[source])
                topologicalSort(mp, visited, stack, source);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            for (int i = 0; i < mp.get(u).size(); i++) {
                Node neighbour = mp.get(u).get(i);
                if (distance[u] != Integer.MAX_VALUE) {
                    System.out.println(neighbour.getEdgeTo() + "  " + distance[u] + " " + neighbour.getWeight());
                    if (distance[neighbour.getEdgeTo()] > distance[u] + neighbour.getWeight())
                        distance[neighbour.getEdgeTo()] = distance[u] + neighbour.getWeight();
                }
            }
        }


        for (int key : mp.keySet())
            System.out.print(key + " " + distance[key] + "  ");

    }

    private static void topologicalSort(Map<Integer, List<Node>> mp, boolean[] visited, Stack<Integer> stack, int source) {
        visited[source] = true;
        for (int i = 0; i < mp.get(source).size(); i++) {
            int neighbour = mp.get(source).get(i).getEdgeTo();
            if (!visited[neighbour])
                topologicalSort(mp, visited, stack, neighbour);
        }
        stack.push(source);
    }
}

class Node {
    private int vertex;
    private int weight;
    private int edgeTo;

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

class Graph {
    Map<Integer, List<Node>> mp = null;

    public Graph() {
        mp = new TreeMap<>();
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

