/**
 * Problem: Given a circular linked list, implement an algorithm which returns
 * the node at the beginning of the loop.
 */

public class Solution6 {
    /**
     * Solution:
     * Use Cycle-Finding algorithm to find the loop. Once we find it, we iterate
     * from the beginning again, return the node where they meet.
     *
     * Analysis:
     * Time Complexity: O(N), where N means the length of the linked list.
     */
    public static ListNode findCycle(ListNode head) {
        if (head == null) return null;

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
