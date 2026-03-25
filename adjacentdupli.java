import java.util.Stack;

public class adjacentdupli {
    public static String removeAdjacentDuplicates(String str) {
        Stack stack = new Stack();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!stack.isEmpty() && (char)stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c); 
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append((char)stack.pop());
        }
        return result.reverse().toString();
    }
    
    public static void main(String[] args) {
        String test1 = "abbaca";
        String test2 = "aabbcc";
        String test3 = "abcd";
        String test4 = "aa";
        String test5 = "abbacd";
        
        System.out.println("Input: " + test1 + " → Output: " + removeAdjacentDuplicates(test1));
        System.out.println("Input: " + test2 + " → Output: " + removeAdjacentDuplicates(test2));
        System.out.println("Input: " + test3 + " → Output: " + removeAdjacentDuplicates(test3));
        System.out.println("Input: " + test4 + " → Output: " + removeAdjacentDuplicates(test4));
        System.out.println("Input: " + test5 + " → Output: " + removeAdjacentDuplicates(test5));
    }
}