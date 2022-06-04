class Solution {
    List<List<String>> lists;
    public List<List<String>> solveNQueens(int n) {
        lists = new ArrayList<>();
        char[][] matrix = new char[n][n];
        for(char[] array : matrix)
        {
            Arrays.fill(array,'.');
        }
        
        recursion(0,n,matrix);
        
        return lists;
    }
    
    void recursion(int row,int n,char[][] matrix)
    {
        if(row == n)
        {
            List<String> list = makeList(matrix);
            lists.add(list);
            return ;
        }
        for(int col = 0;col<n;col++)
        {
            if(isValid(row,col,n,matrix))
            {
                matrix[row][col] = 'Q';
                recursion(row+1,n,matrix);
                matrix[row][col] = '.';
            }
        }
    }
    boolean isValid(int row,int col,int n,char[][] matrix)
    {
        //checking row wise
        for(int i=0;i<row;i++)
        {
            if(matrix[i][col] == 'Q')
                return false;
        }
        int i = row,j=col;
        while(i>=0 && j>=0)
        {
            if(matrix[i][j] == 'Q')
                return false;
            i--;j--;
        }
        i=row;j=col;
        while(i>=0 && j<n)
        {
            if(matrix[i][j] == 'Q')
                return false;
            i--;j++;
        }
        return true;
    }
    List<String> makeList(char[][] matrix)
    {
        List<String> list = new ArrayList<>();
        for(char[] array : matrix)
            list.add(String.valueOf(array));
        return list;
    }
}