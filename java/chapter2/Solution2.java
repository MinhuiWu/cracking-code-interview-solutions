/**
 * Problem: Find the nth to the end of the linked list.
 */

public class Solution2 {
    /**
     * Solution:
     * A simple math - nth to the end equals to: the length - n - 1
     * from the beginning.
     * We can first calculate the length of the linked list then print
     * the (length - n - 1) node from the beginning.
     *
     * Analysis:
     * Time Complexity: O(N), where N means the length of the list.
     * Space Complexity: O(1)
     */
    public static int getNth(ListNode head, int n) {
        if (head == null || n < 0) return -1;

        /* Calculate the length of the linked list */
        int length = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            length++;
        }

        int nth = length - n;
        current = head;
        while (nth != 0) {
            current = current.next;
            nth--;
        }

        return current.value;
    }

    /**
     * Solution:
     * Use two pointers approach, fast and slow pointers.
     * First move fast pointer to n nodes from the head. Now move both pointers
     * one by one until the fast pointer hits the end. Now slow is pointing to
     * the nth node from the end.
     *
     * Analysis:
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static int getNth2(ListNode head, int n) {
        if (head == null || n < 0) throw new IllegalArgumentException();

        ListNode fast = head;
        ListNode slow = head;
        while (n != 0) {
            if (fast == null) {
                throw new IllegalArgumentException("Invalid input n." + n);
            }
            fast = fast.next;
            n--;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.value;

    }

    public static void main(String[] args) {
        ListNode head = ListNode.build(10);
        ListNode.printList(head);
        System.out.println(getNth(head, 2));
        System.out.println(getNth2(head, 2));


    }
}
