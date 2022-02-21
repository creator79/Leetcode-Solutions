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
    public ListNode mergeKLists(ListNode[] lists) {
        //corner case to catch and return
        if(lists.length==0)return null;
        
        //initialize, using dummy node to process more convenient with which case
        //has just one node. It is used in Linked list or array list question             //frequently.
        int k=lists.length;
        ListNode dummy=new ListNode(-1);
        ListNode p=dummy;
        //use lambda exp to define the rule of pq sorting, in this way it means
        //I would create a minimun heap. If you want to create the maximun heap
        //you just need to modify the return expression to 
        //       return b.val-a.val;
        PriorityQueue<ListNode> pq=new PriorityQueue<>(k,(a,b)->
                                                       {return a.val-b.val;});
        
        //add the heads of lists to a priorityqueue for automatively sorting
        for(ListNode head:lists){
            if(head!=null){//It is important because there is an corner case
                           //[[]],the lists.length==1 but the head is null
                pq.offer(head);
            }
        }
        
        //start to move on
        while(!pq.isEmpty()){
            ListNode curNode=pq.poll();
            p.next=curNode;
            p=p.next;
            if(curNode.next!=null){
                //this is why we just need to add the head of the lists to the
                //priority queue, in this process the priority queue would update
                //automatically if the list we point at still have nodes.
                pq.offer(curNode.next); 
            }
        }
        return dummy.next;
    }
}