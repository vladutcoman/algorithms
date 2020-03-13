package book.datastructure.linkedlist;

public class SumNumberList {

    // Helper function to traverse
    void traverse(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }

    // Helper function to reverse the list
    public static Node reverse(Node head)
    {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node curr = head;
        while(curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return head;
    }

    // Function to add two lists
    public static Node sum(Node l1, Node l2)
    {
        if (l2 == null) {
            return l1;
        }
        if (l1 == null) {
            return l2;
        }

        // reverse l1 list
        l1 = reverse(l1);

        // reverse l2 list
        l2 = reverse(l2);

        // storing head whose reverse is to be returned
        // This is where which will be final node
        Node head = l1;
        Node prev = null;
        int carry = 0,sum;
        while (l1 != null && l2 != null) {
            sum = carry + l1.data + l2.data;
            l1.data = sum % 10;
            carry = sum / 10;
            prev = l1;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 != null || l2 != null) {
            if (l2 != null) {
                prev.next = l2;
            }
            l1 = prev.next;
            while (l1 != null) {
                sum = carry + l1.data;
                l1.data = sum % 10;
                carry = sum / 10;
                prev = l1;
                l1 = l1.next;
            }
        }
        if (carry > 0) {
            prev.next = new Node(carry);
        }
        return reverse(head);
    }
}
