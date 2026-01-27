public class Size {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public int size;
    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return; 
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        if(head == null){
            System.out.print("null");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void add(int idx,int data){
        if(idx == 0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i= 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args) {
        Size af = new Size();
        af.addfirst(2);
        af.addfirst(1);
        af.addLast(3);
        af.addLast(4);
        af.add(4,9);
        af.print();
        System.out.print(af.size);
    }
}
