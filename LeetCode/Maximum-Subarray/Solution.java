1class Solution {
2    public int maxSubArray(int[] nums) {
3        int curr = nums[0];
4        int maxSum = nums[0];
5        for(int i = 1;i < nums.length ;i++){
6            curr = Math.max(nums[i],curr + nums[i]);
7
8            maxSum = Math.max(curr,maxSum);
9        }
10        return maxSum;
11    }
12}