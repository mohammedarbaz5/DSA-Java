1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        if(head == null){
19            return head;
20        }
21        Node newHead = new Node(head.val);
22        Node oldTemp = head.next;
23        Node newTemp = newHead;
24        HashMap<Node,Node> map = new HashMap<>();
25        map.put(head,newHead);
26
27        while(oldTemp != null){
28            Node copiedNode = new Node(oldTemp.val);
29            newTemp.next = copiedNode;
30            map.put(oldTemp,copiedNode);
31            oldTemp = oldTemp.next;
32            newTemp = newTemp.next;
33        } 
34        oldTemp = head;
35        newTemp = newHead;
36
37        while(oldTemp != null){
38            newTemp.random = map.get(oldTemp.random);
39            oldTemp = oldTemp.next;
40            newTemp = newTemp.next;
41        }
42        return newHead;
43    }
44}