class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int index[]=new int[k];
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) count++;
            }
            // now change each row last column as the count'f of 1 and each row first element as the index 
            mat[i][mat[0].length-1]=count;
            mat[i][0]=i;
        }
        // now we will sort the last coulumn
        Arrays.sort(mat,(a,b) -> Integer.compare(a[mat[0].length-1],b[mat[0].length-1]));
        for(int i=0;i<k;i++) {
        	index[i]=mat[i][0];
        }
        return index;
    }
}