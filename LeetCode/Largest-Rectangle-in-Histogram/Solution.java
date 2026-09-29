1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        int maxArea =0;
4        int nsl[] = new int[heights.length];
5        int nsr[] = new int[heights.length];
6
7        Stack<Integer> s = new Stack<>();
8
9        //nsr
10        for(int i = heights.length-1;i >= 0;i--){
11            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
12                s.pop();
13            }
14            if(s.isEmpty()){
15                nsr[i] = heights.length;
16            }else{
17                nsr[i] = s.peek();
18            }
19            s.push(i);
20        }
21
22        s = new Stack<>();
23        //nsl
24        for(int i = 0;i < heights.length;i++){
25            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
26                s.pop();
27            }
28            if(s.isEmpty()){
29                nsl[i] = -1;
30            }else{
31                nsl[i] = s.peek();
32            }
33            s.push(i);
34        }
35
36        for(int i = 0 ;i < heights.length ;i++){
37            int height = heights[i];
38            int width = nsr[i] - nsl[i] - 1;
39            int maxarea = height * width;
40            maxArea = Math.max(maxarea,maxArea);
41        }
42        return maxArea;
43    }
44}