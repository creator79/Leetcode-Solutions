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

class Solution {
   public ListNode deleteDuplicates(ListNode head) {
        if(head == null)return null;
        
        ListNode cur = head.next, prev = head;
        
        while(cur != null){
            if(cur.val == prev.val){
                //skipping the duplicate node 
                cur = cur.next;
            }
            else{
                // if not duplicates then make the link
                prev.next = cur;
                prev = cur;
                cur = cur.next;
            }
            
        }
        prev.next = null;
        return head;
    }
}