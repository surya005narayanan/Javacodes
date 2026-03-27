import java.util.*;
class Node {
    int data;
    int priority;
    Node next;
    Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}
public class priorityqueue {
    Node front;
    void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);
        if (front == null || priority < front.priority) {
            newNode.next = front;
            front = newNode;
        } else {
            Node current = front;
            while (current.next != null && current.next.priority <= priority) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    int dequeue() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        int data = front.data;
        front = front.next;
        return data;
    }
    boolean isEmpty() {
        return front == null;
    }
    void display() {
        Node current = front;
        while (current != null) {
            System.out.print("(" + current.data + "," + current.priority + ") ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        priorityqueue pq = new priorityqueue();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter data and priority for element " + i + ": ");
            int data = sc.nextInt();
            int priority = sc.nextInt();
            pq.enqueue(data, priority);
        }
        System.out.println("Elements");
        pq.display();
        sc.close();
    }
}