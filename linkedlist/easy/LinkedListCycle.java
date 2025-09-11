package linkedlist.easy;

import linkedlist.ListNode;


import java.util.HashSet;

public class LinkedListCycle {
    public static void main(String[] args) {

    }
    // Two pointer implementation.
    public boolean hasCycleTwoPointer(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(slow != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }


    // HashSet implementation.
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode curr = head;
        while(curr != null){
            if (hashSet.contains(curr)){
                return true;
            }
            hashSet.add(curr);
            curr = curr.next;
        }
        return false;
    }
}
