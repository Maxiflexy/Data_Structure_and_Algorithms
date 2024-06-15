package com.practice.data_structure_and_algorithm.Graph;

public class UndirectedGraph {

    private int V;  //number of vertices in the graph
    private int E;  //number of edges in the graph
    private int[][] adjMatrix;

    public UndirectedGraph(int nodes){
        this.V = nodes;
        this.E = 0;
        adjMatrix = new int[nodes][nodes];
    }

    public void addEdge(int u, int v){
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
        E++;
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

    public static void main(String[] args) {

        UndirectedGraph graph = new UndirectedGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        System.out.println(graph);


        UndirectedGraph graph1 = new UndirectedGraph(4);
        graph1.addEdge(0, 3);
        graph1.addEdge(1, 2);
        graph1.addEdge(3, 1);
        graph1.addEdge(2, 0);
        System.out.println(graph1);


    }
}
