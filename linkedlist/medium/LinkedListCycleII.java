package linkedlist.medium;

import linkedlist.ListNode;

import java.util.HashMap;


public class LinkedListCycleII {

    public ListNode detectCycleO_1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Step 2: Find cycle start
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;  // No cycle
    }

    public ListNode detectCycle(ListNode head){
        HashMap<ListNode, Integer> hashTable = new HashMap<>();


        ListNode curr = head;
        int pos = 0;
        while(curr != null){
            if (hashTable.containsKey(curr)){
                pos =  hashTable.get(curr);
                return curr;
            }
            hashTable.put(curr,pos);
            pos++;
            curr = curr.next;
        }
        pos = -1;
        return null;
    }
}
