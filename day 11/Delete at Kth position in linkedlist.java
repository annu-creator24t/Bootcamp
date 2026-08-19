public ListNode deleteKth(ListNode head, int k) {
    if (head == null) return null;

    if (k == 1) {
        return head.next;
    }

    ListNode curr = head;

    for (int i = 1; i < k - 1 && curr.next != null; i++) {
        curr = curr.next;
    }

    if (curr.next != null) {
        curr.next = curr.next.next;
    }

    return head;
}