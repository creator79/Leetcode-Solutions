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

    public ListNode insertionSortList(ListNode head) {
        ListNode dummyHead = new ListNode();
        ListNode curr = head;

        while (curr != null) {
            ListNode pre = dummyHead;
            while (pre.next != null && pre.next.val < curr.val) {
                pre = pre.next;
            }

            ListNode next = curr.next;
            curr.next = pre.next;
            pre.next = curr;
            curr = next;
        }
        return dummyHead.next;
    }
}
