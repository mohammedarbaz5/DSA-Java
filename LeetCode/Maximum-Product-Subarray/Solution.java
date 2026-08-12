1class Solution {
2    public int maxProduct(int[] nums) {
3        int maxPro = Integer.MIN_VALUE;
4        for(int i = 0;i < nums.length ;i++){
5            int curr = 1;
6            for(int j = i;j < nums.length;j++){
7                curr *= nums[j];
8                maxPro = Math.max(maxPro,curr);
9            }
10        }
11        return maxPro;
12    }
13}