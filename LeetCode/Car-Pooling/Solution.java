1class Solution {
2    public boolean carPooling(int[][] trips, int capacity) {
3    int maxLocation = 0;
4
5    for (int i = 0; i < trips.length; i++) {
6        maxLocation = Math.max(maxLocation, trips[i][2]);
7    }
8
9        int diff[] = new int[maxLocation+1];
10        for(int i = 0;i < trips.length;i++){
11            int pass = trips[i][0];
12            int from = trips[i][1];
13            int to = trips[i][2];
14
15            diff[from] += pass;
16            diff[to] -= pass;
17        
18        }
19        int sum = 0;
20        for(int i = 0 ;i < diff.length;i++){
21            sum += diff[i];
22            if(sum > capacity){
23                return false;
24            } 
25        }
26        return true;
27    }
28}