class Solution {
public List<List<Integer>> levelOrder(TreeNode root) {
// for returning the list
List<List<Integer>> arr = new ArrayList();
// for bfs storing the nodes
Queue<TreeNode> q = new LinkedList<>();
if(root==null)
return arr;
q.add(root);
while(q.size()!=0)
// !q.isEmpty()
{
//creating list for each level
List<Integer> a = new ArrayList<>();
int s = q.size();
//traverse it from a size of queue
for(int i=0;i<s;i++)
{
TreeNode curr = q.poll();
if(curr.left!=null)
q.add(curr.left);
if(curr.right!=null)
q.add(curr.right);
a.add(curr.val);
}
arr.add(a);
}
return arr;
}
}
​
​
**// prince code
**
// https://leetcode.com/problems/binary-tree-level-order-traversal/
​
vector<vector<int>> levelOrder(TreeNode* root) {
vector<vector<int>> ans;
queue<TreeNode*>q;
q.push(root);
if(root == NULL)
return ans;
while(1){
int size = q.size();
if(size==0)