/**
 * Problem: Check if a linked list  is a palindrome.
 */

public class Solution7 {
    /**
     * Solution:
     * Reverse the linked list then compare each element with the original
     * list.
     *
     * Analysis:
     * Time Complexity: O(N), where N means the length of the linked list.
     * Space Complexity: O(1).
     */
    public static boolean isPalindromeReverse(ListNode head) {
        if (head == null) return false;

        ListNode reversed = reverse(head);
        while (head != null && reversed != null) {
            if (head.value != reversed.value) return false;
            head = head.next;
            reversed = reversed.next;
        }

        return true;
    }

    private static ListNode reverse(ListNode head) {
        ListNode result = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = result;
            result = current;
            current = next;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
        ListNode.printList(head);
        System.out.println(isPalindromeReverse(head));
    }
}
