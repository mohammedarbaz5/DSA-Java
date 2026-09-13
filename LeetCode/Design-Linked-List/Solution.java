1class MyLinkedList {
2
3    public static class ListNode{
4        int val;
5        ListNode next;
6        public ListNode (int val){
7            this.val = val;
8            this.next = null;
9        }
10    }
11    private ListNode head;
12    private int size;
13    public MyLinkedList() {
14        head = null;
15        size = 0;
16    }
17    
18    public int get(int index) {
19        if(index < 0 || index >= size) return -1;
20
21        ListNode temp = head;
22        for(int i = 0 ; i < index;i++){
23            temp=temp.next;
24        }
25        return temp.val;
26    }
27    
28    public void addAtHead(int val) {
29        ListNode newNode = new ListNode(val);
30        if(head == null){
31            head = newNode;
32            size =1;
33            return;
34        }
35        newNode.next = head;
36        head = newNode;
37        size++;
38    }
39    
40    public void addAtTail(int val) {
41        ListNode newNode = new ListNode(val);
42        if(head == null){
43            head = newNode;
44            size = 1;
45            return;
46        }
47        ListNode temp = head;
48        while(temp.next != null){
49            temp=temp.next;
50        }
51        temp.next = newNode;
52        size++;
53    }
54    
55    public void addAtIndex(int index, int val) {
56        ListNode newNode = new ListNode(val);
57
58        if(index == 0){
59            addAtHead(val);
60            return;
61        }
62        ListNode temp = head;
63        int idx = 0;
64        while(idx < index-1){
65            temp = temp.next;
66            idx++;
67        }
68        newNode.next = temp.next;
69        temp.next = newNode;
70        size++;
71    }
72    private ListNode next;
73    public void deleteAtIndex(int index) {
74        if(head == null) return;
75
76        if(index < 0 || index >= size) return;
77
78        if(index == 0){
79            head = head.next;
80            size--;
81            return;
82        }
83        ListNode temp = head;
84        int idx = 0;
85        while(idx < index-1){
86            temp = temp.next;
87            idx++;
88        }
89        temp.next = temp.next.next;
90        size--;
91    }
92}
93
94/**
95 * Your MyLinkedList object will be instantiated and called as such:
96 * MyLinkedList obj = new MyLinkedList();
97 * int param_1 = obj.get(index);
98 * obj.addAtHead(val);
99 * obj.addAtTail(val);
100 * obj.addAtIndex(index,val);
101 * obj.deleteAtIndex(index);
102 */