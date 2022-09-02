class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row = 0;
        int col = arr[row].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                // return new int[] { row, col };
                return true;
            }
 
            // Target lies in further row
            if (arr[row][col] < target) {
                row++;
            }
            // Target lies in previous column
            else {
                col--;
            }
        }
        // return new int[] { -1, -1 };
        return false;
    
        
    }
}