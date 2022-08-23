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
    public boolean isPalindrome(ListNode head) {
               if(head==null){
            return true;
        }
        Stack<Integer> stack=new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            stack.push(curr.val);
            curr=curr.next;
        }
        curr=head;
        while(!stack.isEmpty() && curr!=null){
            if(curr.val!=stack.pop()){
                return false;
            }
            curr=curr.next;
        }
        return true;
    
        
    }
}