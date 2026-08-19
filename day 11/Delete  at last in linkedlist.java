public ListNode deleteLast(ListNode head) {
    if (head == null || head.next == null) return null;

    ListNode curr = head;

    while (curr.next.next != null) {
        curr = curr.next;
    }

    curr.next = null;

    return head;
}