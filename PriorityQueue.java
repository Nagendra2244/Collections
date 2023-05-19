/*Write a program to implement a priority queue using a heap data structure. It should include operations like insert, delete, and peek.
*/

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue {
    private List<Integer> heap;

    public PriorityQueue() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public int delete() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }

        int root = heap.get(0);
        int lastElement = heap.remove(heap.size() - 1);

        if (!isEmpty()) {
            heap.set(0, lastElement);
            heapifyDown(0);
        }

        return root;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }

        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;

        while (index > 0 && heap.get(index) > heap.get(parentIndex)) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int largestIndex = index;

        if (leftChildIndex < heap.size() && heap.get(leftChildIndex) > heap.get(largestIndex)) {
            largestIndex = leftChildIndex;
        }

        if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(largestIndex)) {
            largestIndex = rightChildIndex;
        }

        if (largestIndex != index) {
            swap(index, largestIndex);
            heapifyDown(largestIndex);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.insert(3);
        priorityQueue.insert(1);
        priorityQueue.insert(5);
        priorityQueue.insert(2);

        System.out.println("Peek: " + priorityQueue.peek());

        while (!priorityQueue.isEmpty()) {
            System.out.println("Deleted: " + priorityQueue.delete());
        }
    }
}
