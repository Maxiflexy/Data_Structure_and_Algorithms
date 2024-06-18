package com.practice.data_structure_and_algorithm.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UndirectedGraph {

    private int V;  //number of vertices in the graph
    private int E;  //number of edges in the graph
    private final int[][] adjMatrix;
    private LinkedList<Integer>[] adjacentNode;

    public UndirectedGraph(int nodes){
        this.V = nodes;
        this.E = 0;
        adjMatrix = new int[nodes][nodes];
        this.adjacentNode = new LinkedList[nodes];
        for(int v = 0 ; v < V; v++){
            adjacentNode[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
        E++;
    }

    public void addEdge2(int u, int v){
        adjacentNode[u].add(v);
        adjacentNode[v].add(u);
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(V + "vertices, " + E + " edges " + "\n");
        for(int v = 0; v < V; v++){
            stringBuilder.append(v + ": ");
            for(int w : adjMatrix[v]){
                stringBuilder.append(w + " ");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public void breadthFirstSearch(int source){

        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[source] = true;
        queue.offer(source);
        while (!queue.isEmpty()){
            int n = queue.poll();
            System.out.print(n + " ");
            for(int v : adjacentNode[n]){
                if(!visited[v]){
                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }
    }


    public static void main(String[] args) {

        UndirectedGraph graph = new UndirectedGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        System.out.println(graph);


//        UndirectedGraph graph1 = new UndirectedGraph(5);
//        graph1.addEdge2(0, 1);
//        graph1.addEdge2(1, 2);
//        graph1.addEdge2(2, 3);
//        graph1.addEdge2(3, 0);
//        graph1.addEdge2(2, 4);
//        graph1.breadthFirstSearch(0);


        int n = 3;
        int[][]edges = {{0,1},{1,2},{2,0}};
        int source = 0;
        int destination = 2;

        Solution solution = new Solution();
        boolean output = solution.validPath(n, edges, source, destination);
        System.out.println("Output : " + output);



    }
}

class Solution{

    public boolean validPath(int n, int[][]edges, int source, int destination){

        List<List<Integer>> arrayList = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            arrayList.add(new ArrayList<>());
        }

        for(int[] e : edges){
            int u = e[0];
            int v = e[1];
            arrayList.get(u).add(v);
            arrayList.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        return dfs(visited, arrayList, source, destination);

    }

    private  boolean dfs(boolean[] visited, List<List<Integer>> arrayList, int source, int destination){
        if(source == destination)
            return true;

        visited[source] = true;

        for(int neighbour : arrayList.get(source)){
            if(!visited[neighbour]){
                if(dfs(visited, arrayList, source, destination)){
                    return true;
                }
            }
        }
        return false;

    }




}
