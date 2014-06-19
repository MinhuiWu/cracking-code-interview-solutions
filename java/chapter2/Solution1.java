/**
 * Problem: remove duplicate in a unsorted linked list.
 */

import java.util.HashSet;

public class Solution1 {
    /**
     * Solution:
     * Traverse through the linked list from head to end. For every new node we encounter,
     * check whether it is in the hash set: if so, remove it, otherwise we
     * put it in the set.
     *
     * Analysis:
     * Time Complexity: O(N), where N means the length of the list. For worst
     * case, the duplicate locates at the end of the list.
     * Space Complexity: O(N), where N means the length of the list.
     */
    public static void removeDuplicate1(ListNode head) {
        if (head == null) return;

        ListNode current = head;
        HashSet<Integer> table = new HashSet<Integer>();
        table.add(current.value); // Head node could not be removed.

        while (current.next != null) {
            if (table.contains(current.next.value)) {
                current.next = current.next.next;
            } else {
                table.add(current.value);
                current = current.next;
            }
        }
    }

    /**
     * Solution:
     * If addtional space is not allowed, we can use a nested while loop to compare each
     * new node with the rest of the list.
     *
     * Analysis:
     * Time Complexity: O(N^2), where N means the length of the list.
     * Space Complexity: O(1).
     */
    public static void removeDuplicate2(ListNode head) {
        if (head == null) return;

        ListNode current = head;
        while (current != null) {
            ListNode runner = current;
            while (runner.next != null) {
                if (current.value == runner.next.value) {
                    current.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }


    public static void main(String[] args) {
        ListNode head = ListNode.build(10);
        head.next.value = 1;
        ListNode.printList(head);
        removeDuplicate1(head);
        ListNode.printList(head);


        head = ListNode.build(10);
        head.next.value = 1;
        ListNode.printList(head);
        removeDuplicate2(head);
        ListNode.printList(head);

    }

}
