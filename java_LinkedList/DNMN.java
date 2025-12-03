public class DNMN {
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
public void addfirst(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}
public void printList(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.print("null");
    System.out.println();
}
public Node dnmn(int m,int n){
    int counter = 1;
    Node curr = head;
    Node reshead = null;
    Node restail = null;

    while(curr != null){
        if(counter <= m){
            if(restail == null){
                reshead = restail = curr;
            } else{
                restail.next = curr;
                restail = curr;
            }
        }
        if (counter == (m+n)){
            counter = 1;
        } else{
            counter++;
        }
        curr = curr.next;
    }
    restail.next = null;
    return reshead;
}
public static void main(String args[]){
            DNMN ll = new DNMN();
            ll.addfirst(100);
            ll.addfirst(90);
            ll.addfirst(80);
            ll.addfirst(70);
            ll.addfirst(60);
            ll.addfirst(50);
            ll.addfirst(40);
            ll.addfirst(30);
            ll.addfirst(20);
            ll.addfirst(10);
            ll.printList();
            ll.dnmn(3,2);
            ll.printList();
        }
}
