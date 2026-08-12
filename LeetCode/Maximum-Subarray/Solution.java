1class Solution {
2    public int maxSubArray(int[] nums) {
3        int curr = 0;
4        int maxSum = nums[0];
5        for(int i = 0;i < nums.length ;i++){
6            curr += nums[i];
7            maxSum = Math.max(curr,maxSum);
8
9            if(curr < 0){
10                curr = 0;
11            }
12        }
13        return maxSum;
14    }
15}