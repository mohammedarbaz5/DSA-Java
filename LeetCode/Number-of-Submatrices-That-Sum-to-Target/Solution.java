1class Solution {
2    public int numSubmatrixSumTarget(int[][] matrix, int target) {
3
4        int rows = matrix.length;
5        int cols = matrix[0].length;
6
7        // 1. Build 2D Prefix Sum
8        int[][] prefix = new int[rows + 1][cols + 1];
9
10        for (int i = 1; i <= rows; i++) {
11            for (int j = 1; j <= cols; j++) {
12                prefix[i][j] = matrix[i - 1][j - 1]
13                        + prefix[i - 1][j]
14                        + prefix[i][j - 1]
15                        - prefix[i - 1][j - 1];
16            }
17        }
18
19        int count = 0;
20
21        // 2. Choose top and bottom rows
22        for (int top = 0; top < rows; top++) {
23
24            for (int bottom = top; bottom < rows; bottom++) {
25
26                // 3. HashMap for the 1D problem
27                HashMap<Integer, Integer> map = new HashMap<>();
28                map.put(0, 1);
29
30                int sum = 0;
31
32                // 4. Traverse columns
33                for (int col = 0; col < cols; col++) {
34
35                    // Sum of this column between top and bottom
36                    int columnSum =
37                            prefix[bottom + 1][col + 1]
38                            - prefix[top][col + 1]
39                            - prefix[bottom + 1][col]
40                            + prefix[top][col];
41
42                    // 5. Running prefix sum
43                    sum += columnSum;
44
45                    // 6. Same idea as LeetCode 560
46                    int val = sum - target;
47
48                    if (map.containsKey(val)) {
49                        count += map.get(val);
50                    }
51
52                    // Store prefix sum frequency
53                    map.put(sum, map.getOrDefault(sum, 0) + 1);
54                }
55            }
56        }
57
58        return count;
59    }
60}