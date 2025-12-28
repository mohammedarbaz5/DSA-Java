public class CountNegatives {

    // Method to count negative numbers
    public static int countNegatives(int[][] grid) {
        int counter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    // Main method (VS Code execution starts here)
    public static void main(String[] args) {

        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };

        int result = countNegatives(grid);
        System.out.println("Number of negative elements: " + result);
    }
}
