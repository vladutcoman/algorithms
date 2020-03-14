package book.datastructure.stacksandqueues;


import book.datastructure.linkedlist.Node;

/** LIFO */
public class Stack {
    Node top;
    Integer pop() {
        if (top != null) {
            int item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }
    void push(int value) {
        Node t = new Node(value);
        t.next = top;
        top = t;
    }
}
