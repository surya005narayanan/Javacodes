import java.util.Stack;
import java.util.*;
class ss{
public String reverse(String str) {
    Stack<Character> stack = new Stack<>();
    for (char c : str.toCharArray()) stack.push(c);

    StringBuilder reversed = new StringBuilder();
    while (!stack.isEmpty()) reversed.append(stack.pop());
    
    return reversed.toString();
}
public void main(String[] args) {
    String s = "hello";
    System.out.println(reverse(s)); 
}
}