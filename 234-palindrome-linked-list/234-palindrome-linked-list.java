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
/*

step 1 :- a-->b-->c-->c-->b-->a


step 2 :- a-->b-->c   c-->b-->a  // mid nikal ke LL ko tod diya  c.next==null karke
          FH      M   SH         // yaha SH(second head) ko reverse function me daal ke LL ko reverse kar denge  .

step 3 :- a-->b-->c    a-->b-->c   
          FH      M    SH          // yaha  pe first head and second head ko compare karenge  ki unki value same hai ki nahi.


*/

class Solution {
     public boolean isPalindrome(ListNode head) {
        
        ListNode mid = middleNode(head) ;
        ListNode sh = mid.next ;
        mid.next = null ;
         
         ListNode t1 = head;
         ListNode t2 = reverseList(sh);
         
         while(t2!=null){
             if(t1.val!=t2.val) return false;
             
             t1 = t1.next;
             t2 = t2.next;   
         }  
        return true;
    }
//     Mid LL
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
       return  slow;
}
//     reverse LL
    public ListNode reverseList(ListNode head) {
        ListNode p = null;
       ListNode c = head;
        while (c != null) {
            //preserve
            ListNode n = c.next;

            //conncection
            c.next = p;

            // move
            p = c;
            c = n;
        }
        return p;
    }
    
}