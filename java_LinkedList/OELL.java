public class OELL {

    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // add node at the beginning
    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Rearrange list: all even nodes before odd nodes (stable; O(n) time, O(1) extra space)
    public Node oell(Node head) {
        if (head == null || head.next == null) return head;

        Node evenh = null, event = null;
        Node oddh = null, oddt = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;   // save next
            curr.next = null;        // detach current

            if (curr.data % 2 == 0) {             // even
                if (evenh == null) {
                    evenh = event = curr;
                } else {
                    event.next = curr;
                    event = curr;
                }
            } else {                              // odd
                if (oddh == null) {
                    oddh = oddt = curr;
                } else {
                    oddt.next = curr;
                    oddt = curr;
                }
            }

            curr = next; // move forward
        }

        // If there are no evens, return odd head
        if (evenh == null) {
            // update tail to last odd node
            tail = oddt;
            return oddh;
        }

        // Link even list to odd list (oddh may be null)
        event.next = oddh;

        // update tail: if odd tail exists use it, otherwise even tail
        tail = (oddt != null) ? oddt : event;

        return evenh;
    }

    // print list from global head
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        OELL ll = new OELL();

        // build list (addfirst inserts at head; calls below produce 1->2->3->4->5 as final before rearrange)
        ll.addfirst(6);
        ll.addfirst(1);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.addfirst(10);
        ll.addfirst(12);
        ll.addfirst(8);

        System.out.print("Original: ");
        ll.printList();

        // rearrange and assign returned head to the global head
        head = ll.oell(head);

        System.out.print("Rearranged: ");
        ll.printList();
    }
}
