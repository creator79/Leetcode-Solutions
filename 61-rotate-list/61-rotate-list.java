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
      // https://leetcode.com/problems/rotate-list/discuss/1838527/(JAVA-C%2B%2B)-Best-Diagramatic-Explanation
      class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Base Condition OR edge case
        if(head == null || head.next == null || k == 0) return head;
        
        ListNode curr = head; // pointer current
        int count = 1; // here count is length
        while(curr.next != null){ // reach end of list, and have the count
            count++;
            curr = curr.next;
        }
        curr.next = head; // connect last node to head node to make it circular
        k = count - (k % count); // get the length
        while(k--> 0) curr = curr.next; // now move pointer, to the kth node
        head = curr.next; // make the head 
        curr.next = null; // and point that curr to null
        
        return head;
    }
}
        