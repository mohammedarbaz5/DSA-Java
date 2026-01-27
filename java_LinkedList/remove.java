public class remove {
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
    public int removefirst(){
        if(size == 0){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removelast(){
        if(size == 0){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
           int val  = tail.data;
           head = tail = null;
           size = 0;
           return val; 
        }
        int i = 0;
        Node prev = head;
        while(i<size-2){
            prev = prev.next;
            i++;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static void main(String[] args) {
        remove af = new remove();
        af.addfirst(2);
        af.addfirst(1);
        af.addLast(3);
        af.addLast(4);
        af.add(4,9);
        af.print();
        System.out.println(af.size);
        af.removefirst();
        af.print();
        System.out.println(af.size);
        af.removelast();
        af.print();
        System.out.println(af.size);
    }
}

