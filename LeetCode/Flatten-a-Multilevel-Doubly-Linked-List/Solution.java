1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public Node flatten(Node head) {
13        if(head == null) return head;
14        Node curr = head;
15        while(curr != null){
16            if(curr.child != null){
17                Node next = curr.next;
18                curr.next = flatten(curr.child);
19
20                curr.next.prev = curr;
21                curr.child = null;
22
23                while(curr.next != null){
24                    curr = curr.next;
25                }
26                if(next != null){
27                    curr.next = next;
28                    next.prev = curr;
29                }
30            }
31            curr = curr.next;
32        }
33        return head;
34    }
35}