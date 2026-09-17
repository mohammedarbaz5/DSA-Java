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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        if(left == right) return head;
14        int i = 1;
15        ListNode dummy = new ListNode(0);
16        dummy.next = head;
17
18        ListNode prevLeft = dummy; 
19        while(i < left){
20            prevLeft = prevLeft.next;
21            i++;
22        }
23        
24
25        ListNode curr = prevLeft.next;
26        ListNode prev = null;
27        ListNode next;
28        i = 0;
29        while(i <= right - left){
30            next = curr.next;
31            curr.next = prev;
32            prev = curr;
33            curr = next;
34            i++;
35        }
36        ListNode leftNode  = prevLeft.next;
37        prevLeft.next = prev;
38        leftNode.next = curr;
39        return dummy.next;
40    }
41}