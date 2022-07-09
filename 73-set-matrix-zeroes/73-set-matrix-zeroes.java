class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int colom  = matrix[0].length;
        int x = 1,y=1;
        for(int i=0;i<row;i++){
            if(matrix[i][0] == 0){
                x = 0;
                break;
            }
        }
        for(int i=0;i<colom;i++){
            if(matrix[0][i] == 0){
                y = 0;
                break;
            }
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<colom;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=1;i<colom;i++){
            if(matrix[0][i] == 0){
                for(int l=0;l<row;l++){
                    matrix[l][i] = 0;
                }
            }
        }

        for(int i=1;i<row;i++){
            if(matrix[i][0] == 0){
                for(int l=1;l<colom;l++){
                    matrix[i][l] = 0;
                }
            }
        }

        if(y==0){
            for(int i=0;i<colom;i++){
                matrix[0][i] = 0;
            }
        }

        if(x==0){
            for(int i=0;i<row;i++){
                matrix[i][0] = 0;
            }
        }
    }
}