package linkedlist.medium;

import linkedlist.ListNode;

import java.util.List;

public class RemoveDuplicatesFromSortedListII {
    public static void main(String[] args) {
        ListNode node7 = new ListNode(5, null);
        ListNode node1 = new ListNode(4 , node7);
        ListNode node2 = new ListNode(4, node1);
        ListNode node3= new ListNode(3, node2);
        ListNode node4 = new ListNode(3 , node3);
        ListNode node5 = new ListNode(2 , node4);
        ListNode node6 = new ListNode(1 , node5);

        // Given the head of a sorted linked list. Delete all nodes that have duplicate numbers, leaving only distinct
        // numbers from the original list. Return the linked list sorted as well.
        System.out.println(deleteDuplicates(node6));

    }
    public static ListNode deleteDuplicates(ListNode head) {
        //use two pointers, slow - track the node before the dup nodes,
        // fast - to find the last node of dups.
        ListNode dummy = new ListNode(0);
        ListNode fast = head;
        ListNode slow = dummy;
        slow.next = fast;
        while(fast != null) {
            while (fast.next != null && fast.val == fast.next.val) {
                fast = fast.next;    //while loop to find the last node of the dups.
            }
            if (slow.next != fast) { //duplicates detected.
                slow.next = fast.next; //remove the dups.
                fast = slow.next;     //reposition the fast pointer.
            } else { //no dup, move down both pointer.
                slow = slow.next;
                fast = fast.next;
            }

        }
        return dummy.next;
    }
}
