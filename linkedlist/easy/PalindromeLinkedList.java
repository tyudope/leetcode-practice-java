package linkedlist.easy;

import linkedlist.ListNode;

import javax.swing.*;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(1 , null);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3= new ListNode(2, node2);
        ListNode node4 = new ListNode(1 , node3);



        System.out.println("Is 1->2->2->1  Palindrome ?  : " + isPalindrome(node4));

    }
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Build stack while fast moves 2x
        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: If odd length, skip ONE middle node (when fast != null)
        if (fast != null) {
            slow = slow.next;
        }

        // Step 3: Compare rest with stack
        while (slow != null) {
            if (stack.isEmpty() || slow.val != stack.pop()) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }
}
