1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        Stack<Integer> s = new Stack<>();
4        int ans[]  = new int[temperatures.length];
5        for(int i = temperatures.length-1 ; i >= 0; i--){
6            while(!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]){
7                s.pop();
8            }
9            if(s.isEmpty()){
10                ans[i] = 0;
11            }else{
12                ans[i] = Math.abs(i - s.peek());
13            }
14            s.push(i);
15        }
16        return ans;
17    }
18}