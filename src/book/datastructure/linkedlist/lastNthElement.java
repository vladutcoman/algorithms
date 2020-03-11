package book.datastructure.linkedlist;

public class lastNthElement {

    public static void main(String[] args) {
        LinkedListNode list = new LinkedListNode();
        list.head = new Node(4);
        list.head.next = new Node(5);
        list.head.next.next = new Node(8);
        list.head.next.next.next = new Node(9);

        Node res = getLastNthElement(list, 4);

        System.out.println(res.data);
    }

    private static Node getLastNthElement(LinkedListNode list, int n) {
        if (list.head == null && n < 1) {
            return null;
        }
        Node p1 = list.head;
        Node p2 = list.head;
        for (int i = 0; i < n - 1; i++) {
            if (p2 == null) {
                return null;
            }
            p2 = p2.next;
        }
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

}
