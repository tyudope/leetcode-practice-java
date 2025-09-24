package linkedlist.medium;

import linkedlist.ListNode;

public class RemoveNthNodeFromEndOfList {


    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode slow = head;
        ListNode fast = head;

        // move fast nth step ahead.
        // By doing this, when 'fast' node hit the last node 'slow' points to the Nth from end.
        for(int i = 0; i< n; i++){
            fast = fast.next;
        }
        if (fast == null){
            return head.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;

    }
}
