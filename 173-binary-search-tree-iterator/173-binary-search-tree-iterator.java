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
class BSTIterator {

    
    Stack<TreeNode> stack; 

    public BSTIterator(TreeNode root) {
        stack = new Stack() ; 
        pushLeftArmToStack(root) ;
    }
    
    public int next() {
        TreeNode node = stack.pop() ;
//         yaha pe apne right ke saare left element ko stack me daal dena hai uske liye ek function likh lo
        pushLeftArmToStack(node.right) ;
        return node.val; 
    }
    
    public boolean hasNext() {
        return !stack.isEmpty() ;
    }
    
    private void pushLeftArmToStack(TreeNode node) {
        while(node != null) {
            stack.push(node) ;
            node = node.left; 
        }
    }
}
/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */