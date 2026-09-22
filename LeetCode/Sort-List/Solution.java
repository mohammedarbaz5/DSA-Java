1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode findMid(ListNode head){
13        ListNode slow = head;
14        ListNode fast = head.next;
15        while(fast != null && fast.next != null){
16            slow = slow.next;
17            fast = fast.next.next;
18        }
19        return slow;
20    }
21    public ListNode sortList(ListNode head) {
22        if (head == null || head.next == null){
23            return head;
24        }
25        ListNode mid = findMid(head);
26        ListNode righthead = mid.next;
27        mid.next = null;
28        ListNode newLeft = sortList(head);
29        ListNode newRight = sortList(righthead);
30        return merge(newLeft,newRight);
31    }
32    public ListNode merge(ListNode head1,ListNode head2){
33        ListNode dummy = new ListNode(0);
34        ListNode tail = dummy;
35        while(head1 != null && head2 != null){
36            if(head1.val <= head2.val){
37            tail.next = head1;
38            head1 = head1.next;
39        }else{
40            tail.next = head2;
41            head2 = head2.next;
42        }
43        tail = tail.next;
44        }
45
46        if(head1 != null){
47            tail.next = head1;
48        }else{
49            tail.next = head2;
50        }
51        return dummy.next;
52    }
53}