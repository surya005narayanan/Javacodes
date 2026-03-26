import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class switchqueue{
    Node front,rear;
    void enqueue(int data){
        Node newnode = new Node(data);
        if(rear == null){
            front=rear=newnode;
            return;
        }
        rear.next = newnode;
        rear = newnode;
    }
    int dequeue(){
        if(front==null){
            System.out.println("The Queue is empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if(front==null){
            rear = null;
        }
        return value;

    }
    void display(){
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.data + " : ");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        switchqueue q = new switchqueue();
        int choice;
        do {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    int removed = q.dequeue();
                    if (removed != -1)
                        System.out.println("Removed: " + removed);
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
        sc.close();
    }
}
