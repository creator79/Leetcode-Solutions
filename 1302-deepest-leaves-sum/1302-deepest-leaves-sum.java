/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
public int height(TreeNode root){
    if(root == null){
        return 0;
    }
    int lh = height(root.left);
    int rh = height(root.right);
    int h = Math.max(lh, rh) + 1;
    return h;
}

public void getSum(TreeNode root, int currHeight, int height){
    if(root != null){
        if(currHeight == height){
            sum = sum + root.val;
        }
        else{
            getSum(root.left, currHeight+1, height);
            getSum(root.right, currHeight+1, height);
        }
    }
}

int sum = 0;
public int deepestLeavesSum(TreeNode root) {
    
    int treeDepth = height(root);
    
    if(root == null){
        return 0;
    }
    getSum(root, 1, treeDepth);
    return sum;
}
}