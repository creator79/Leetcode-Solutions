lass Solution {
public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
List<List<Integer>> res = new ArrayList<>();
Queue<TreeNode> q = new LinkedList<>();
if (root == null) return res;
// keeping a flag variable for zigzag traversal
boolean flag = true;
q.add(root);
while (!q.isEmpty()) {
int size = q.size();
List<Integer> li = new ArrayList<>(size);
for (int i = 0; i < size; i++) {
TreeNode cur = q.poll();
if (cur.left != null) {
q.add(cur.left);
}
if (cur.right != null) {
q.add(cur.right);
}
// if flag is true (left -> right)
if (flag == true) li.add(cur.val);
// else (right -> left)
else li.add(0, cur.val);
}
// changing flag for each level
flag = !flag;
res.add(li);
}
return res;
}
}