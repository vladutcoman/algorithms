package book.datastructure.linkedlist;

public class CircularListStart {

    public static void main(String[] args) {
        LinkedListNode list = new LinkedListNode();
        list.head = new Node(4);
        list.head.next = new Node(5);
        Node circular = list.head.next;
        list.head.next.next = new Node(8);
        list.head.next.next.next = new Node(9);
        list.head.next.next.next.next = circular;

        Node res = findCircularListStart(list);

        System.out.println(res);
    }

    public static Node findCircularListStart(LinkedListNode list) {
        Node head = list.head;
        Node slow = head;
        Node fast = head;
        System.out.println("First");
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        System.out.println("Second");
        if (fast.next == null) {
            return null;
        }
        slow = head;
        System.out.println("Third");
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println("Last");
        return fast;
    }
}
