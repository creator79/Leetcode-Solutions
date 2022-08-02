class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
         if (root == null) return ans;

         q.add(root);
          boolean  lfr = true;
        
        while(!q.isEmpty()){
            
            int size=q.size();
            List <Integer> arr = new ArrayList<>(size);
            
            for (int i=0;i<size;i++){
                TreeNode front=q.poll();
//                 
                if(front.left!=null){
                    q.add(front.left);
                }
                 
                if(front.right!=null){
                    q.add(front.right);
                }
                // if flag is true (left -> right)
            if (lfr == true) arr.add(front.val);
            // else (right -> left)
            else arr.add(0, front.val);
                
            }

            // changing flag for each level
            lfr=!lfr;
            
           ans.add(arr);
            
            
        }
        return ans;
        
    }
}
