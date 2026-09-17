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
12    public ListNode swapPairs(ListNode head) {
13        if(head == null || head.next == null) return head;
14
15        ListNode dummy = new ListNode(0);
16        dummy.next = head;
17        ListNode prev = dummy;
18        while(prev.next != null && prev.next.next != null){
19            ListNode first = prev.next;
20            ListNode second = first.next;
21
22//          reversal is being done here 
23            first.next = second.next;
24            second.next = first;
25            prev.next = second;
26            
27            //moving the pointer to first coz first is at 2nd pairth node   
28            prev = first;
29        }
30        return dummy.next;
31    }
32}