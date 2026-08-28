1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        int sum = 0;
5        int count= 0;
6        map.put(0,1);
7        for(int j = 0;j < nums.length;j++){
8            sum += nums[j];
9            int val = sum - k;
10            if(map.containsKey(val)){
11                count += map.get(val);
12            }
13            map.put(sum,map.getOrDefault(sum,0)+1);
14        }
15        return count;
16    }
17}