class Solution
{
  public int numTrees(int n)
  {
      // O(n^2) time | O(n) space
      int[] tree = new int[n+1];
      
      // 0 node = empty tree  = 1 tree
      // 1 node = 1 root-tree = 1 tree
      tree[0] = 1;
      tree[1] = 1;
      
      for(int i = 2; i <= n; i++)
      {         
          for(int j = 1; j <= i; j++)
          {
              int left = j - 1;
              int right = i - j;
              tree[i] += tree[left] * tree[right];
          }        
      }
      return tree[n];
  }
}