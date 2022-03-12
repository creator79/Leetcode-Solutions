// Points:-
// Store the old and corresponding new Node in the map.
// Traverse the Node recursivelly and while returning from recursion set the respective pointer, next and random pointer.

class Solution {

    Map<Node,Node> map = new HashMap<>();
	
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node temp = new Node(head.val);
        map.put(head,temp);
        temp.next = copyRandomList(head.next);
        temp.random = map.get(head.random);
        return temp;
    }
}