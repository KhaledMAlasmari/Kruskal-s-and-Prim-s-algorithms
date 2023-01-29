/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GroupProjectPart1;

/**
 *
 * @author khaled
 */
public class Edge implements Comparable<Edge> {

    int start, end, cost;

    public Edge(int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }

    public int compareTo(Edge e) {
        return Double.compare(this.cost, e.cost);
    }
}
