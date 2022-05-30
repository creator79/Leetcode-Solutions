// Approach

// 1. Take out root to node path in an arraylist
// Ex in example 1 
//     the root to node path will be [5,3]
    
// 2. Now traverse in that arraylist and observe that we have to print k levels down from node 
//     5                   3
//     |                   |
//     k level             k-1 level 
//     so print all elements k level down from 5 and (k-1) level down from 3
// 3. But what will happen is it will print the elements such as 5 also as it is 1 level down from 3 but we have to stop that

// 4. To stop that use previous element in arraylist as blocker and when you will reach blocker simply return from it.
   
// -------------------------------------------------------------------------
class Solution {
    //print k levels down function 
    ArrayList<Integer> heapal=new ArrayList<>();
    public void  printklevelsdown(TreeNode root,int k,TreeNode blocker) {
        if(root==null || k<0 || root==blocker){
            
            return;
        }
        if(k==0){
            heapal.add(root.val);
        }
        
        printklevelsdown(root.left,k-1,blocker);
        printklevelsdown(root.right,k-1,blocker);
    }
    
    //step1 
    public ArrayList<TreeNode> ntr(TreeNode root,TreeNode data){
        if(root==null){
            return new ArrayList<>();
        }
        if(root==data){
            ArrayList<TreeNode> al=new ArrayList<>();
            al.add(root);
            return al;
        }
        
        ArrayList<TreeNode> left=ntr(root.left,data);
        if(left.size()>0){
            left.add(root);
            return left;
        }
        
         ArrayList<TreeNode> right=ntr(root.right,data);
        if(right.size()>0){
            right.add(root);
            return right;
        }
        
        return new ArrayList<>();
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        //find node to root path
        ArrayList<TreeNode> al=ntr(root,target);
        
        //traverse in that arraylist
        for(int i=0;i<al.size();i++){
            printklevelsdown(al.get(i),k-i,i==0?null:al.get(i-1));
        }
        
        // i==0?null:al.get(i-1) we have written this because for 1st element in arraylist there will be no blocker so it will be null and for 2 element 1st element will be blocker so as to avoid printing that element.
        
        return heapal;
        
    }
}