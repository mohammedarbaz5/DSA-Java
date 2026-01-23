class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    // Reverse k nodes
    static Node reverseKGroup(Node head, int k) {
        if (head == null || k == 1) return head;

        Node curr = head;
        int count = 0;

        // check if k nodes exist
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        if (count < k) return head;

        // reverse k nodes
        curr = head;
        Node prev = null;

        for (int i = 0; i < k; i++) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // recursive call for remaining list
        head.next = reverseKGroup(curr, k);

        return prev;
    }

    // Print list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        // Create linked list manually: 1 → 2 → 3 → 4 → 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;

        System.out.print("Original List: ");
        printList(head);

        head = reverseKGroup(head, k);

        System.out.print("\nReversed in k-group: ");
        printList(head);
    }
}