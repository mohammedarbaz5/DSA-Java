1class NumMatrix {
2        int[][] prefix;
3    public NumMatrix(int[][] matrix) {
4        prefix = new int[matrix.length+1][matrix[0].length+1];
5        int sum = 0;
6        for(int i = 1;i <= matrix.length;i++){
7            for(int j = 1;j <= matrix[0].length;j++){
8                prefix[i][j] = prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1] + matrix[i-1][j-1];
9            }
10        }
11    }
12    
13    public int sumRegion(int row1, int col1, int row2, int col2) {
14        return prefix[row2 + 1][col2 + 1]
15                - prefix[row1][col2 + 1]
16                - prefix[row2 + 1][col1]
17                + prefix[row1][col1];
18    }
19}
20
21/**
22 * Your NumMatrix object will be instantiated and called as such:
23 * NumMatrix obj = new NumMatrix(matrix);
24 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
25 */