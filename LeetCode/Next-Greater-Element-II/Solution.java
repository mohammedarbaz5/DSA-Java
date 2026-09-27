1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        Stack<Integer> s = new Stack<>();
4        int[] nge = new int[nums.length];
5        
6        for(int i= 2 * nums.length-1 ; i >= 0;i--){
7            int index = i % nums.length;
8            while(!s.isEmpty() && nums[s.peek()] <= nums[index]){
9                s.pop();
10            }
11            if(s.isEmpty()){
12                nge[index] = -1;
13            }else{
14                nge[index] = nums[s.peek()];
15            }
16            s.push(index);
17        }
18    return nge;
19    }
20}