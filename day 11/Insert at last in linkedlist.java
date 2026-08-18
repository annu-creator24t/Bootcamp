static Node insertLast(Node head, int data) {
    Node newNode = new Node(data);

    if (head == null) {
        return newNode;
    }

    Node temp = head;

    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = newNode;

    return head;
}