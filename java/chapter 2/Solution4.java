/**
 * Problem: Partition two sorted linked lists.
 */

public class Solution4 {
    /**
     * Solution:
     *
     */
    public static ListNode partition(ListNode first, ListNode second) {
        if (first == null) return second;

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy.next;
        while (first != null && second != null) {
            if (first.value < second.value) {
                current
            }
        }
    }
}
