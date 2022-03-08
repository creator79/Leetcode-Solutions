/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode t = head;
        ListNode p = head;
        
        while(p != null && p.next != null){
            p = p.next.next;
            t = t.next;
            if(p==t)
                return true;
        }
        return false;
    }
}