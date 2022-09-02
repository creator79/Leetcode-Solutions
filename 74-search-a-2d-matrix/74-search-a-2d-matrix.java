class Solution {
   public boolean searchMatrix(int[][] arr, int target) {
        //  solve using inbuild binary search function
        for(int i=0;i<arr.length;i++){
            int index = Arrays.binarySearch(arr[i],target);
            if(index>=0){
                return true;
            }
        }
       return false;
    }
}