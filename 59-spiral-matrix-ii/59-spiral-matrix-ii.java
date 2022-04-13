class Solution {
    public int[][] generateMatrix(int n) {
        int left = 0, top = 0; // Initialize Left and top pointer with Start index
        int right = n-1, bottom = n-1; // Initialize Right and bottom Pointer with End Endex. 
        
        // Counter to add Numbers in Array
        int count = 1;
        
        // Generate Array of given n*n size
        int arr[][] = new int[n][n];
        
        // Keep 4 pointers in Array --> Left, Right, Top, bottm
        // In 4 Directions we Need to Traverse the Array(For Better Understanding Assume Clockwise Directions).
        // Step by step Directions are Mentioned below
        // 1) Left   -> Right
        // 2) Top    -> Bottom
        // 3) Right  -> Left
        // 4) Bottom -> Top
        
        // Continue this cycle untill left <= right or top <= bottom
        while(left <= right) {
            
            // Left -> Right Direction Traversal 
            // After this Increment top As now we will move towords bottom
            for(int i = left; i <= right; i++) {
                arr[top][i] = count++;
            }
            top++;
            
            // Top -> Bottm Direction Traversal
            // After This Decrement Right as now we will move towards left
            for(int i = top; i <= bottom; i++) {
                arr[i][right] = count++;
            }
            right--;
            
            // Right -> Left Direction Traversal
            // After this Decrement Bottm as now we will move towards Top
            for(int i = right; i >= left; i--) {
                arr[bottom][i] = count++;
            }
            bottom--;
            
            // Bottom -> Top Direction Traversal
            // After this Incerement Left as now we will move towards right 
            for(int i = bottom; i >= top; i--) {
                arr[i][left] = count++;
            }
            left++;
            
            // After this whole 4 Directional traversal, this cycle will again repeat in Clockwise Direction and Continue untill left <= right or top <= bottom
        }
        
        return arr;
    }
}