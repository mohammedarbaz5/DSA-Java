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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        Stack<Integer> s1 = new Stack<>();
14        Stack<Integer> s2 = new Stack<>();
15        ListNode curr = null;
16        while(l1 != null){
17            s1.push(l1.val);
18            l1 = l1.next;
19        }
20
21        while(l2 != null){
22            s2.push(l2.val);
23            l2 = l2.next;
24        }
25        int carry = 0;
26        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0){
27            int sum = carry;
28            if(!s1.isEmpty()) sum += s1.pop();
29            
30            if(!s2.isEmpty()) sum += s2.pop();
31
32            carry = sum/10;
33            ListNode newNode = new ListNode(sum % 10);
34            newNode.next = curr;
35            curr = newNode;
36        }
37        return curr;
38    }
39}