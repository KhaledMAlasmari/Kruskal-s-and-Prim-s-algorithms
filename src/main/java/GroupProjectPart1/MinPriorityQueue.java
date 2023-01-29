/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GroupProjectPart1;

/**
 *
 * @author khaled
 */
public abstract class MinPriorityQueue {
    
    
    
    public abstract Edge getMin();
    public abstract Edge extractMin();
    public abstract void insert(Edge val);
    public abstract boolean isEmpty();

}
enum QueueType {
  ARRAY,
  HEAP,
}