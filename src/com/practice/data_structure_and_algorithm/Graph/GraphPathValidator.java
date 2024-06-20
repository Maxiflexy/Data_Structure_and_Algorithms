package com.practice.data_structure_and_algorithm.Graph;
import java.util.*;

public class GraphPathValidator {

    public static void main(String[] args) {
//        int n = 6;
//        int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
//        int source = 0;
//        int destination = 5;

//        int n = 3;
//        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
//        int source = 0;
//        int destination = 2;

        int n = 6;
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 1}};
        int source = 1;
        int destination = 4;




        boolean pathExists = validPath1(n, edges, source, destination);
        System.out.println("Does path exist from " + source + " to " + destination + "? " + pathExists);
    }

    public static boolean validPath1(int n, int[][] edges, int source, int destination) {
        // Step 1: Build adjacency list representation of the graph
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Step 2: Handle the case where source and destination are the same
        if (source == destination) {
            return true;
        }

        // Step 3: BFS to find a path from source to destination
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                if (neighbor == destination) {
                    return true;
                }
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

        // Step 4: If BFS completes without finding a destination
        return false;
    }

    public boolean validPath2(int n, int[][] edges, int source, int destination) {
        // Initialize graph as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        /*
        n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
         */

        // Build the graph manually
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (!graph.containsKey(u)) {
                graph.put(u, new ArrayList<>());
            }
            if (!graph.containsKey(v)) {
                graph.put(v, new ArrayList<>());
            }
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Initialize visited set
        Set<Integer> visited = new HashSet<>();

        // Depth-First Search (DFS)
        Stack<Integer> stack = new Stack<>();
        stack.push(source);

        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (int neighbor : graph.get(vertex)) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }

        return visited.contains(destination);
    }
}
