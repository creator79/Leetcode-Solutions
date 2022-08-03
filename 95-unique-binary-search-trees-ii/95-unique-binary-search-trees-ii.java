
class Solution {
    public List<TreeNode> generateTrees(int n) {
        return helper(1, n);
    }
    public List<TreeNode> helper(int si, int end){
        if(si > end){
            List<TreeNode> al = new ArrayList<>();
            al.add(null);
            return al;
        }
        
        List<TreeNode> ans = new ArrayList<>();
        for(int i = si; i <= end; i++){
            List<TreeNode> left = helper(si, i - 1);
            List<TreeNode> right = helper(i + 1, end);
            
            for(TreeNode l : left){
                for(TreeNode r : right){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    ans.add(root);
                }
            }
            
        }
        return ans;
    }
}