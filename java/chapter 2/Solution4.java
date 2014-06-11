/**
 * Problem: Partition two lists around value x so that all nodes less than x
 * come before and all nodes greater than x come after.
 */

public class Solution4 {
    /**
     * Solution:
     * This problem is a variant of Merge Sort, the difference is the pivot
     * element is given. We can easily traverse the two linked list and compare
     * them around value x.
     *
     * Analysis:
     * Time Complexity: O(N), where N means the length of linked list.
     * Space Complexity: O(M+N)
     */
    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode dummyBefore = new ListNode(-1);
        ListNode pBefore = dummyBefore;

        ListNode dummyAfter = new ListNode(-1);
        ListNode pAfter = dummyAfter;

        while (head != null) {
            if (head.value < x) {
                pBefore.next = head;
                pBefore = pBefore.next;
            } else {
                pAfter.next = head;
                pAfter = pAfter.next;
            }
            head = head.next;
        }

        pBefore.next = dummyAfter.next;
        pAfter.next = null;

        return dummyBefore.next;

    }

    public static void main(String[] args) {
        ListNode head = ListNode.build(10);
        ListNode.printList(head);
        head.next.value = 10;
        head.next.next.value = 9;
        head = partition(head, 7);
        ListNode.printList(head);
    }
}
