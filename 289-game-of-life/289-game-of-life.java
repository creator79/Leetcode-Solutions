class Solution {
    public void gameOfLife(int[][] board) {
      int rows = board.length, cols = board[0].length;
    int[][] tempBoard = new int[rows][cols];     // we will first update values in this temporary matrix
    for(int r = 0; r < rows; r++){
        for(int c = 0; c < cols; c++){
          int lnbr = nbr(board,r-1,c-1) + nbr(board,r-1,c) + nbr(board,r-1,c+1) + nbr(board,r,c+1) + nbr(board, r+1, c+1) +
          nbr(board, r+1, c) + nbr(board, r+1, c-1) + nbr(board,r,c-1);
            //System.out.println("cell: ("+r+","+c+") ,  lnbr: "+lbnr);
          
          if (board[r][c]==1){
            // toh give condition s ka code likhenge
            tempBoard[r][c]= (lnbr<2|| lnbr>3)?0:1;
          }
          else{
            tempBoard[r][c] = (lnbr == 3) ? 1 : 0;
          }
        }
    }
                  
      for(int i=0;i<board.length;++i)//copying the temp to board
        {
          for(int j=0;j<board[0].length;++j)
            board[i][j]=tempBoard[i][j];
        }
}
  
  public int nbr(int[][] board , int r, int c){
     if( r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == 0 ){ 
       return 0; 
      }                          // out of bound cases
    return 1;
  }
}




















