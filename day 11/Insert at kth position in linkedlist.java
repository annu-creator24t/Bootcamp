static Node insertKth(Node head, int data, int k) {
    Node newNode = new Node(data);

    if (k == 1) {
        newNode.next = head;
        return newNode;
    }
    Node temp = head;

    for (int i = 1; i < k - 1 && temp != null; i++) {
        temp = temp.next;
    }

    if (temp == null) {
        return head;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    return head;
}