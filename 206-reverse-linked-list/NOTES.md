class Solution {
public ListNode reverseList(ListNode head) {
return reverse(head,null);
}
public ListNode reverse(ListNode head,ListNode previous){
if(head==null){
return previous;
}
ListNode next = head.next;
head.next = previous;
return reverse(next,head);
}
}