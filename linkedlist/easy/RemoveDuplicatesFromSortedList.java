package linkedlist.easy;

import linkedlist.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(3 , null);
        ListNode node2 = new ListNode(3, node1);
        ListNode node3= new ListNode(2, node2);
        ListNode node4 = new ListNode(2 , node3);
        ListNode node5 = new ListNode(1 , node4);
        ListNode node6 = new ListNode(1 , node5);

        System.out.println(""+ deleteDuplicates(node6).val);

    }
    public static ListNode deleteDuplicates(ListNode head){

        // Initialize a pointer current to the head of the linked list to traverse list.
        // Start a while loop continues until current reaches the end of the list or current.next reaches null
        // Insided the loop, compare the value of the current node current.val with the value of the next node
        // (Remove the duplicate)
        // If the values are equal, it indicates a duplicate node. In this case, update the next pointer of the
        // current node current.next to skip the next node(remove the duplicate)
        // If the values are not equal, move the current pointer to the next node, continuing traversal
        // repeat the loop until end of the list is reached.
        // After the loop, return the modified linked list.

        ListNode current = head;
        while (current != null && current.next != null){
            if (current.val == current.next.val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return current;


    }
}
