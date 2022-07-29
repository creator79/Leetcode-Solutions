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
class Solution{
 public ListNode detectCycle(ListNode head) {
        if(head == null)
        {
            return head;
        }
        
        // Step 1 : Is there any Cycle?
        
        ListNode slow = head;
        ListNode fast = head;
          int length = 0;
        while(fast!= null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        
        
      
        if(slow==fast)
        {
            length = lengthOfCycle(slow);
            break;
        }
        
        }
        
        // if length = 0 ? No Cycle
        if(length == 0)
        {
            return null;
        }
        
        ListNode s = head;
        ListNode f = head;
        
        // Step 2 : Move s ahead by length times. 
        
       while(length > 0)
       {
           s = s.next;
           length--;
       }
        
        // Step 3 : Move f and s both one by one until they meet;
        while(f!=s)
        {
            f=f.next;
            s=s.next;
        }
        
       return s;
    }
    
    public int lengthOfCycle(ListNode slow)
    {
        int length = 0;
        ListNode temp = slow;
        do
        {
            length++;
            temp = temp.next;
        }
        while(temp!=slow);
        
        return length;
    }
}
