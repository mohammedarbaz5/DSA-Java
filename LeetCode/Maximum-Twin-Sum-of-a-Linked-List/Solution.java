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
12    public int pairSum(ListNode head) {
13        ListNode slow = head;
14        ListNode fast = head;
15        while(fast != null && fast.next != null){
16            slow = slow.next;
17            fast = fast.next.next;
18        }
19        ListNode prev = null;
20        while(slow != null){
21
22            ListNode next = slow.next;
23            slow.next = prev;
24            prev = slow;
25            slow = next;
26        }
27        int ans = 0;
28
29        while(prev != null ){
30            ans = Math.max(ans, head.val + prev.val);
31            head = head.next;
32            prev = prev.next;
33        }
34        return ans;
35    }
36}