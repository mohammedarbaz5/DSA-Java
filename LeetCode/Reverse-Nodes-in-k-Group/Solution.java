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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        ListNode temp = head;
14        int i= 0;
15        while(i<k){
16            if(temp == null){
17                return head;
18            }
19            temp = temp.next;
20            i++;
21        }
22        ListNode prev = null;
23        ListNode curr = head;
24        ListNode next;
25        int count =0;
26        while(count<k){
27            next = curr.next;
28            curr.next = prev;
29            prev = curr;
30            curr = next;
31            count++;
32        }
33        head.next = reverseKGroup(curr,k);
34        return prev;
35    }
36}