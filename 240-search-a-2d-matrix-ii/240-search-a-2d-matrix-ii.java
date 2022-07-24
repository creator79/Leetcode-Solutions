// If value is > then target, then move to left i.e. j--

// If value is < then target, then move down i.e. i++

// If value is == to target, return true

// Else return false
// Brute force is done previously

// tc= O(row + column)
// sc=o(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        
        while(i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) j--;
            else if(matrix[i][j] < target) i++;
        }
        return false;
    }
}