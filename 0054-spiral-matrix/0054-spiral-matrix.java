// We start by traversing the top row from left to right, then the rightmost column from top to bottom, then the bottom row
// from right to left (if there is more than one row), and finally the leftmost column from bottom to top 
// (if there is more than 
// one column). After each traversal, we update the corresponding boundary to shrink the valid region, 
// and we continue this process until all elements have been visited.


class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Initialize variables to keep track of the boundaries of the matrix.
        int top = 0; // Topmost row index
        int bottom = matrix.length - 1; // Bottommost row index
        int left = 0; // Leftmost column index
        int right = matrix[0].length - 1; // Rightmost column index

        // ArrayList to store the spiral order traversal of the matrix.
        ArrayList<Integer> ans = new ArrayList<>();

        // While there are still elements to traverse in the matrix.
        while (top <= bottom && left <= right) {

            // Traverse the topmost row from left to right.
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++; // Move the top boundary down by 1.

            // Traverse the rightmost column from top to bottom.
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--; // Move the right boundary left by 1.

            // Check if there is still a row to be traversed from right to left.
            if (top <= bottom) {
                // Traverse the bottommost row from right to left.
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--; // Move the bottom boundary up by 1.
            }

            // Check if there is still a column to be traversed from bottom to top.
            if (left <= right) {
                // Traverse the leftmost column from bottom to top.
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++; // Move the left boundary right by 1.
            }
        }

        // Return the ArrayList containing the spiral order traversal of the matrix.
        return ans;
    }
}