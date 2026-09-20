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
13        if(head == null || k == 1) return head;
14        ListNode temp = head;
15        List<Integer> list = new ArrayList<>();
16        while(temp != null) {
17            list.add(temp.val); 
18            temp = temp.next;
19        }
20
21        for(int i = 0 ; i + k <= list.size();i+=k){
22            int left = i;
23            int right = i +k -1;
24            while(left < right){
25                int t = list.get(left);
26                list.set(left,list.get(right));
27                list.set(right,t);
28                left++;
29                right--;
30            }
31        }
32        ListNode curr = head;
33        int i = 0 ; 
34        while(curr != null){
35            curr.val = list.get(i++);
36            curr = curr.next;
37        }
38        return head;
39    }
40}