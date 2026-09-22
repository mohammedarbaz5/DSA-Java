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
12    public ListNode sortList(ListNode head) {
13        if(head == null || head.next == null) return head;
14        ListNode mid = findmid(head);
15        ListNode newrighthead = mid.next;
16        mid.next = null;
17        ListNode Lefthead = sortList(head);
18        ListNode righthead = sortList(newrighthead);
19        return merge(Lefthead,righthead);
20    }
21        public ListNode merge(ListNode Lefthead,ListNode righthead){
22            ListNode dummy = new ListNode(-1);
23            ListNode temp = dummy;
24            while(Lefthead != null && righthead != null){
25                if(Lefthead.val < righthead.val){
26                    temp.next = Lefthead;
27                    Lefthead = Lefthead.next;
28                }else{
29                    temp.next = righthead;
30                    righthead = righthead.next;
31                }
32                temp = temp.next;
33            }
34            while(Lefthead != null){
35                temp.next = Lefthead;
36                Lefthead = Lefthead.next;
37                temp = temp.next;
38            }
39            while(righthead != null){
40                temp.next = righthead;
41                righthead = righthead.next;
42                temp = temp.next;
43            }
44            return dummy.next;
45
46        }
47
48
49        public ListNode findmid(ListNode head){
50            ListNode slow = head;
51            ListNode fast = head.next;
52            while(fast != null && fast.next != null){
53                slow = slow.next;
54                fast = fast.next.next;
55            }
56            return slow;
57        }
58}