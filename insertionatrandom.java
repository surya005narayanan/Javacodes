public static Node insertAtPosition(Node head, int data, int pos) {
    Node newNode = new Node(data);

    if (pos == 1) {
        newNode.next = head;
        return newNode;
    }

    Node temp = head;
    for (int i = 1; i < pos - 1 && temp != null; i++) {
        temp = temp.next;
    }
    if (temp == null) {
        System.out.println("Invalid position");
        return head;
    }
    newNode.next = temp.next;
    temp.next = newNode;

    return head;
}