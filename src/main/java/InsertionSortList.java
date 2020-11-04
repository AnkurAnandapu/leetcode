public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }

        final ListNode dummy = new ListNode(0);
        ListNode current = head;
        ListNode previous = dummy;
        ListNode next;
        while (current != null) {
            next = current.next;
            while (previous.next != null && previous.next.val < current.val) {
                previous = previous.next;
            }
            current.next = previous.next;
            previous.next = current;
            previous = dummy;
            current = next;
        }
        return dummy.next;
    }
}