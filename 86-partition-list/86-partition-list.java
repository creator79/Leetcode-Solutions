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

    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode h = head;

        ListNode leftTail = left;
        ListNode rightTail = right;

        while (h != null) {
            if (h.val < x) {
                leftTail.next = h;
                leftTail = leftTail.next;
                h = h.next;
            } else {
                rightTail.next = h;
                rightTail = rightTail.next;
                h = h.next;
            }
        }

        leftTail.next = right.next;
        rightTail.next = null;

        return left.next;
    }
}
