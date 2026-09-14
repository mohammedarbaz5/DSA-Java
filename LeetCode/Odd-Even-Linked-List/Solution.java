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
12    public ListNode oddEvenList(ListNode head) {
13    if(head == null ||head.next == null) return head;
14    ListNode odd = head;
15    ListNode even = head.next;
16
17    ListNode evenHead = even;
18    while(even != null && even.next != null){
19        odd.next = even.next;
20        odd= odd.next;
21        even.next = odd.next;
22        even = even.next;
23    }
24    odd.next = evenHead;
25    return head;   
26    }
27}
28
29