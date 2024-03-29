// package Q3;

import java.util.ArrayList;

public class PriorityQueueu_QN3B {

    MinHeap_QN3B heap;

    PriorityQueueu_QN3B() {
        heap = new MinHeap_QN3B();
    }

    int dequeue() {
        return heap.deleteHeap(0);
    }

    void queue(int element) {
        heap.insertHeap(element);
    }

    public static void main(String[] args) {
        PriorityQueueu_QN3B pq = new PriorityQueueu_QN3B();
        pq.queue(12);
        pq.queue(213);
        pq.queue(99);
        pq.queue(21);
        pq.queue(143);

        // System.out.println(pq.dequeue());
        pq.dequeue();
        System.out.println(pq);

    }

    @Override
    public String toString() {
        return heap.heapList.toString();
    }

}
