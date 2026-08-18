class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

static Node insertFirst(Node head, int data) {
    Node newNode = new Node(data);

    newNode.next = head;
    head = newNode;

    return head;
}