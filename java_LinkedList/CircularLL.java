public class CircularLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
    }
}
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            tail.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }
    public void print(){
        Node temp = head;
        if(head == null){
            System.out.print("Empty");
            return;
        }
        do{
            System.out.print(temp.data + "->");
            temp = temp.next;
        }while(temp != head);
    }
    public static void main(String args[]){
        CircularLL cll = new CircularLL();
        cll.addFirst(3);
        cll.addFirst(2);
        cll.addFirst(1);
        cll.addLast(4);
        cll.addLast(5);
        cll.print();
    }
}
