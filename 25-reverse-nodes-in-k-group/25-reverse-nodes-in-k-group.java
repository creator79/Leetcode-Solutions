class Solution {
    public ListNode reverseKGroup(ListNode A, int B) {
        if (B == 1) return A;

        // List size calculation for groups calculation later
        int size = 0;
        ListNode curr = A;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        /*
            Calculating the groups size to be reversed, taking one group at a time in loop 
        */
        int groupSize = size / B;
        ListNode currentNode = A, previousNode = null, firstNode = A, lastNodeOfCurrentGroup = null;
        int nodePositionInGroup = 1;
        while (groupSize > 0) {
            // resetting the position of the node in currently executing group of list 
            nodePositionInGroup %= B;
            while (currentNode != null) {
                if (nodePositionInGroup > B) break;
                ListNode tempNext = currentNode.next;
                currentNode.next = previousNode;
                previousNode = currentNode;
                currentNode = tempNext;
                nodePositionInGroup++;
            }
            
            /*
                Below statement does not executes for first time as lastNodeOfCurrentGroup is null,
				intially assigning first node as last node of reversed list of current group
                1->2->3->4->5->6->7->8->NULL, B = 4
                4->3->2->1 --->  (1  is assigned as lastNodeOfCurrentGroup as list looks like this here)
                4->3->2->1->5->6->7->8
            */
            if (lastNodeOfCurrentGroup != null) {
                lastNodeOfCurrentGroup.next = previousNode;
            }

            /*
                Since the first node of the non-reversed list will become the last node of the reversed list
                of the group, hence the first node of currently executing group is set as last node for the 
                next iteration of the while loop 
            */
            lastNodeOfCurrentGroup = firstNode;
            
            
            /*
                For the first time since first group is getting reversed hence the first node is changing   
                it's position, hence the reference to head is set to last node of the first group when
                reversed, this is executed only once
            */
            if (groupSize == size / B) {
                A = previousNode;
            }
            
            
            /*
                Adjusting the next pointer of the reversed group (first node of the reversed group should 
                point to the next node of the new group) and first node reference variable is again reset to 
                become the actual first node for the next group in iteration
            */
            firstNode.next = currentNode;
            firstNode = currentNode;
            groupSize--;
        }
        return A;
    }
}
