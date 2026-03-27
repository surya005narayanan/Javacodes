import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue pq = new PriorityQueue();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter data and priority for element " + (i + 1) + ": ");
            int data = sc.nextInt();
            int priority = sc.nextInt();
            pq.enqueue(data, priority);
        }

        System.out.println("Priority Queue elements:");
        pq.display();

        sc.close();
    }
}