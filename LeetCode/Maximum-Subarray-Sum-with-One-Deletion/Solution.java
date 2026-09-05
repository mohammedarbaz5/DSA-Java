1class Solution {
2    public int maximumSum(int[] arr) {
3        int sum = 0;
4        int currDelete = 0;
5        int currmax = 0;
6        int maxDelete= Integer.MIN_VALUE;
7        int maxSum = Integer.MIN_VALUE;
8        for(int i =0;i < arr.length;i++){
9            currDelete = Math.max(currmax,currDelete+arr[i]);
10            currmax = Math.max(currmax+arr[i],arr[i]);
11            maxSum = Math.max(currmax,maxSum);
12            maxDelete = Math.max(currDelete,maxDelete);
13        }
14        if(maxSum < 0) return maxSum;
15        return Math.max(maxSum,maxDelete);
16    }
17}