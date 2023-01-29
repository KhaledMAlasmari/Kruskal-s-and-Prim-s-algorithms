/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GroupProjectPart1;

import java.util.ArrayList;

/**
 *
 * @author khaled
 */
public class PrimAlgorithm {

    public static ArrayList<Edge> findMST(Graph graph, int source, QueueType queueType) {
        if (queueType == QueueType.ARRAY) {
            return  findMST(graph, source, new MinPriorityQueueUsingArray(graph.getNumberOfEdges()));

        } else {
            return findMST(graph, source, new MinPriorityQueueUsingHeap(graph.getNumberOfEdges()));
        }
    }

    private static ArrayList<Edge> findMST(Graph graph, int source, MinPriorityQueue queue) {
        int cost = 0;
        boolean[] visited = new boolean[graph.getnVerts()];
        ArrayList<Edge> includedEdges = new ArrayList<>();
        MinPriorityQueue priorityQueue = queue;
        Vertex[] verticesList = graph.getVertexList();
        for (Edge edge : verticesList[source].neighbors) {
            priorityQueue.insert(edge);
        }
        visited[source] = true;
        while (!priorityQueue.isEmpty()) {
            Edge edge = priorityQueue.extractMin();
            if (visited[edge.end]) {
                continue;
            }
            visited[edge.end] = true;
            includedEdges.add(edge);
            cost += edge.cost;
            for (Edge neighbor : verticesList[edge.end].neighbors) {
                priorityQueue.insert(neighbor);
            }
        }
        return includedEdges;
    }
}
