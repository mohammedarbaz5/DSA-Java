1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] res = new int[nums.length];
4        int prefix[] = new int[nums.length];
5        int suffix[] = new int[nums.length];
6        int n = nums.length-1;
7        prefix[0] = 1;
8        for(int i = 1 ;i < nums.length ;i++){
9            prefix[i] = prefix[i-1] * nums[i-1];
10        }
11        suffix[n] = 1;
12        for(int i = n-1;i >= 0;i--){
13          suffix[i] = suffix[i+1] * nums[i+1];
14        }
15        
16        for(int i = 0; i< prefix.length;i++){
17            res[i] = prefix[i] * suffix[i];
18        }
19        return res;
20    }
21}