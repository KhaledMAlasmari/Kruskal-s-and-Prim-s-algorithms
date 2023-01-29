/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GroupProjectPart1;

/**
 *
 * @author khaled
 */
public class MinPriorityQueueUsingArray extends MinPriorityQueue {

    private Edge[] array;
    private int currentElementIndex;
    private int maxSize;

    public MinPriorityQueueUsingArray(int queueSize) {
        array = new Edge[queueSize];
        maxSize = queueSize;
        currentElementIndex = 0;
    }

    @Override
    public void insert(Edge val) {
        // array is empty just insert at front
        if (currentElementIndex == 0) {
            array[currentElementIndex++] = val;
        } else {
            int i;
            for (i = currentElementIndex - 1; i >= 0; i--) {
                if (val.cost > array[i].cost) // if new item is larger than the last item i.e. with higher 
                //priority
                {
                    array[i + 1] = array[i]; // shift upward i.e. right
                } else {
                    break;
                }
            }
            array[i + 1] = val;
            currentElementIndex++;
        }
    }

    public Edge extractMin() {
        return array[--currentElementIndex];
    }

    public boolean isEmpty() {
        return currentElementIndex == 0;
    }

    @Override
    public Edge getMin() {
        return array[currentElementIndex - 1];
    }
    

}
