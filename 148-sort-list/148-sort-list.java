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
// Time Complexity (o(n))
// Space Complexity (o(n))
// Space Optimsied ho sakta hai
class Solution {
    public ListNode sortList(ListNode head) {
        List <Integer> ans = new ArrayList<>();
        ListNode p= head;
        
        while(p!=null){
            ans.add(p.val);
            p=p.next;
            
        }
        Collections.sort(ans);
        ListNode ll = head;
        while(ll!=null){
            for (int i=0;i<ans.size();i++){
                ll.val = ans.get(i);
                ll= ll.next;
            }
           
        }
        return head;
    }
}