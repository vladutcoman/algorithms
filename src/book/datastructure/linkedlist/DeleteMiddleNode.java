package book.datastructure.linkedlist;

public class DeleteMiddleNode {

    public static void main(String[] args) {
        LinkedListNode list = new LinkedListNode();
        list.head = new Node(4);
        list.head.next = new Node(5);
        list.head.next.next = new Node(8);
        list.head.next.next.next = new Node(9);

        deleteMiddle(list);
        Node n = list.head;

        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void deleteMiddle(LinkedListNode list) {
        Node head = list.head;
        if (head != null) {
            Node p1 = head;
            Node p2 = head;
            Node previous;
            while (p2 != null && p2.next != null) {
                previous = p1;
                p1 = p1.next;
                p2 = p2.next.next;
            }
            head.deleteNode(head, p1.data);
        }
    }
}
