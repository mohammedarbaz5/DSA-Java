1// 
2class Solution {
3    public int subarraySum(int[] nums, int k) {
4        HashMap<Integer,Integer> map = new HashMap<>();
5        int sum = 0,count = 0;int lsum = 0;
6        for(int i= 0; i < nums.length; i++){
7            sum = 0;
8            for(int j = i; j < nums.length;j++){
9                sum += nums[j];
10                if(sum == k){
11                    count++;
12                   
13                   }
14                   }
15                   }
16            return count;
17}
18}