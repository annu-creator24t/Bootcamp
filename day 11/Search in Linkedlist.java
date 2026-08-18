class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean search(Node head, int target) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }
}