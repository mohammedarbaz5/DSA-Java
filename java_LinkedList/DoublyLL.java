public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next= head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void removeFirst(){
        if(head == null){
            System.out.print("DLL is empty");
            return;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
    }
    public void removeLast(){
        if(head == null){
            System.out.print("null");
            return;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String args[]){
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println();
        System.out.println(dll.size);

        dll.addLast(4);
        dll.print();
        System.out.println();

        dll.removeFirst();
        dll.print();
        System.out.println();
        dll.removeLast();
        dll.print();
        System.out.println();
        System.out.println(dll.size);
    }
}
