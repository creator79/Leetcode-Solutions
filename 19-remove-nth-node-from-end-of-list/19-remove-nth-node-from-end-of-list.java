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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = head;

        int c = 0;

        while (prev != null) { // prev is dummy don,t think very special
            c++;

            prev = prev.next;
        }

        int pos = c - n;

        if (pos == 0) {
            head = head.next;

            return head;
        } else {
            ListNode ptr = head;

            int count = 0;

            ListNode pre = head;

            while (count < pos && ptr != null) {
                pre = ptr;

                count++;

                ptr = ptr.next;
            }

            if (ptr != null) pre.next = ptr.next;
        }

        return head;
    }
}
