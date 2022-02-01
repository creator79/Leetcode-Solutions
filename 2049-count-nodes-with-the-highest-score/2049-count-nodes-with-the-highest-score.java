class Solution {
      long max = 0;
    int maxCount = 0;
    
    public int countHighestScoreNodes(int[] parents) {
        int N = parents.length;
        //construct tree in form of array
        int[][] tree = new int[N][2];
        for (int i = 0; i < N; i++) tree[i] = new int[] {-1, -1};
        
        for (int i = 1; i < N; i++) {
            int parent = parents[i];
            int[] t = tree[parent];
            if (t[0] == -1) {
                t[0] = i;
            } else {
                t[1] = i;
            }
        }
        //traverse the tree
        helper(tree, 0);
        return maxCount;
    }
    
    long helper(int[][] tree, int idx) {
        int[] t = tree[idx];
		//get number of nodes in left and right sub-trees
        long left = t[0] != -1 ? helper(tree, t[0]) : 0;
        long right = t[1] != -1 ? helper(tree, t[1]) : 0;
		//compute the number of nodes in parent per formula p = N - 1 - left - right
        long parentScore = tree.length - 1 - right - left;
        long score = (left == 0 ? 1 : left) 
            * (right == 0 ? 1: right) 
            * (parentScore == 0 ? 1 : parentScore);
        updateMaxScore(score);
		//this is number of nodes in sub-tree that rooted at current node. It's at least 1 for the leaf 
        return left + right + 1;
    }
    
    void updateMaxScore(long score) {
        if (max == score) {
            maxCount++;
        } else if (max < score) {
            max = score;
            maxCount = 1;
        }
    }
        
    }
