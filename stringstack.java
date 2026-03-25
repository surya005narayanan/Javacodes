
class Node {
    char data;
    Node next;
    
    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;
    
    Stack() {
        this.top = null;
    }
    
    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    
    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return '\0';
        }
        char data = top.data;
        top = top.next;
        return data;
    }
    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("(empty)");
            return;
        }
        Node current = top;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("]");
    }
}

public class stringstack {
    public static void main(String args[]) {
        String word = "afc8HJ#";
        Stack charStack = new Stack();   
        Stack other = new Stack();    
        System.out.println("String: " + word);
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                charStack.push(ch);
                System.out.println(ch);
            } else {
                other.push(ch);
                System.out.println(ch);
            }
        }
        System.out.print("Character Stack: ");
        charStack.display();
        System.out.print("Other Stack: ");
        other.display();
    }
}