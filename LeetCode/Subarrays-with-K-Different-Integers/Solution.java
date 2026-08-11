1class Solution {
2    public int subarraysWithKDistinctInt(int[] nums, int k) {
3        int left = 0;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        int count = 0;
6        for(int right = 0;right < nums.length;right++){
7            int num = nums[right];
8            map.put(num,map.getOrDefault(num,0)+1);
9            
10            while(map.size() > k){
11                map.put(nums[left],map.get(nums[left])-1);
12                if(map.get(nums[left]) == 0){
13                    map.remove(nums[left]);
14                }
15                left++; 
16            }
17            count+= right - left + 1;
18        }
19        return count;
20    }
21    public int subarraysWithKDistinct(int[] nums, int k) {
22        return subarraysWithKDistinctInt(nums,k) - subarraysWithKDistinctInt(nums,k-1);
23}
24}