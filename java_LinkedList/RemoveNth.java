public class RemoveNth {
    public class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
public static Node head;
public static Node tail;
public void printList(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.print("null");
    System.out.println();
}
public void addLast(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = tail =  newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;
}
    Node deleteNode(int x) {
        // code here
    
        Node temp = head;
        if(x == 1){
            return head = head.next;
        }
        int i = 1;
        Node prev = head;
        while(i < (x-1) && prev != null){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
        }
        public static void main(String args[]){
            RemoveNth ll = new RemoveNth();
            ll.addLast(3);
            ll.addLast(7);
            ll.addLast(5);
            ll.addLast(0);
            ll.printList();
            ll.deleteNode(3);
            ll.printList();

        }
}
