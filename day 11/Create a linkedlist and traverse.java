class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // create nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // connect nodes to form a linked list
        head.next = second;
        second.next = third;
        //  Traverse the linked list and print the elements
        Node temp  = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}