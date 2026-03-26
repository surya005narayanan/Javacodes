import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class queuelinkedlist{
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
    }
    public static void main(String args[]){
        queuelinkedlist q = new queuelinkedlist();
        q.enqueue(32);
        q.enqueue(23);
        q.enqueue(45);
        q.enqueue(87);
        q.display();
    }
}