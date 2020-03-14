package book.datastructure.stacksandqueues;

import book.datastructure.linkedlist.Node;

/** FIFO */
public class Queue {
    Node first, last;
    void enqueue(int item) {
        if (first == null) {
            last = new Node(item);
            first = last;
        } else {
            last.next = new Node(item);
            last = last.next;
        }
    }
    Integer dequeue(Node n) {
        if (first != null) {
            int item = first.data;
            first = first.next;
            return item;
        }
        return null;
    }
}
