/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        return toBST(head);
    }
    public TreeNode toBST(ListNode head){
        if(head==null)
            return null;
        
        if(head.next==null){
            return new TreeNode(head.val);
        }
        
        //Divide list into two parts
        
        //first half
        ListNode fHalf = head;
        ListNode temp = findPrevMiddle(head);
        
        //curr data
        int curr = temp.next.val;
        
        //second half
        ListNode sHalf = temp.next.next;
        temp.next = null;
        
        //create tree node
        TreeNode root = new TreeNode(curr);
        root.left = toBST(fHalf);
        root.right = toBST(sHalf);
        
        return root;
    }
    
    //to get the previous of the the middle node previous
    public ListNode findPrevMiddle(ListNode head){
        if(head==null || head.next==null)
            return head;
        
        ListNode slow = head;
        ListNode fast = head.next.next;
        
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
}