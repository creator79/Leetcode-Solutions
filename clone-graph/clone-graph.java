/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/


class Solution {
    Node[] copyNodes = new Node[100];
    
    public Node cloneGraph(Node node) 
    {
        if (node == null) return null; // stupid null nodes
        
        int ind = node.val-1; // So I don't have to write "node.val-1" all the time
        if (copyNodes[ind] == null) 
        {
            copyNodes[ind] = new Node(node.val); 
            for (Node neighbor : node.neighbors) 
                copyNodes[ind].neighbors.add(cloneGraph(neighbor));
        }
        return copyNodes[ind]; // Just return the copied node if it exists.
    }
}