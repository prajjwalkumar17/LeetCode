import java.util.Scanner;
import java.util.*;

public class Main {

    public static int minimumWeight(int n, int[] arr, int c, int d) {
        //Create directed req from the array given in input
        List<List<Integer>> req = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            req.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                req.get(i).add(arr[i]);
            }
        }
        //Create two arrays A and B for storing min distance from c and d
        long[] A = new long[n];
        long[] B = new long[n];
        Arrays.fill(A, Long.MAX_VALUE);
        Arrays.fill(B, Long.MAX_VALUE);
        //Part 1 and Part 2 of Algo -> Implement a dijkstra function and call it for both arrays A and B
        dijkstra(c, req, A);
        dijkstra(d, req, B);
        //Now comes Part 3 part of algo-> loop through and get node with min(A[i]+B[i])
        int node = 0;
        long dist = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (A[i] == Long.MAX_VALUE || B[i] == Long.MAX_VALUE) continue;
            if (dist > A[i] + B[i]) {
                dist = A[i] + B[i];
                node = i;
            }
        }
        if (dist == Long.MAX_VALUE) return -1; //if no meeting point is found
        return node;
    }

    private static void dijkstra(int start, List<List<Integer>> req, long[] distances) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(start);
        distances[start] = 0;
        while (!pq.isEmpty()) {
            int curr = pq.poll();
            for (int neighbor : req.get(curr)) {
                long distance = distances[curr] + 1; //all arr have same weight 1
                if (distance < distances[neighbor]) {
                    distances[neighbor] = distance;
                    pq.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 4, 1, 4, 13, 8, 8, 8, 0, 8, 14, 9, 15, 11, -1, 10, 15, 22, 22, 22, 22, 22, 21};
        System.out.println(minimumWeight(arr.length, arr, 9, 2));
    }

}