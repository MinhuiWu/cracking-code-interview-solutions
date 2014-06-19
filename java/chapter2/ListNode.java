public class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = next;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public static ListNode build(int n) {
        ListNode head = new ListNode(0, null);
        ListNode current = head;
        for (int i = 1; i < n; i++) {
            current.next = new ListNode(i, null);
            current = current.next;
        }

        return head.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = build(10);
        head.next.value = 1;
        printList(head);
    }
}
