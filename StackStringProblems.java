import java.util.*;
public class StackStringProblems {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;
                char top = st.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static String reverse(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char c : s.toCharArray()) {
            st.push(c);
        }
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        return res.toString();
    }
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        for (char c : st) {
            res.append(c);
        }
        return res.toString();
    }
    public static int precedence(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        if (c == '^') return 3;
        return -1;
    }
    public static String infixToPostfix(String exp) {
        Stack<Character> st = new Stack<Character>();
        StringBuilder result = new StringBuilder();
        for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            else if (c == '(') {
                st.push(c);
            }
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                if (!st.isEmpty()) st.pop(); // safe pop
            }
            else {
                while (!st.isEmpty() &&
                      (precedence(c) < precedence(st.peek()) ||
                      (precedence(c) == precedence(st.peek()) && c != '^'))) {
                    result.append(st.pop());
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        return result.toString();
    }
    public static int evalPostfix(String exp) {
        Stack<Integer> st = new Stack<Integer>();
        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c)) {
                st.push(c - '0');
            } else {
                if (st.size() < 2) return -1; // safety
                int b = st.pop();
                int a = st.pop();
                switch (c) {
                    case '+': st.push(a + b); break;
                    case '-': st.push(a - b); break;
                    case '*': st.push(a * b); break;
                    case '/': st.push(a / b); break;
                }
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        System.out.println("Valid: " + isValid("({[]})"));
        System.out.println("Reverse: " + reverse("hello"));
        System.out.println("No Duplicates: " + removeDuplicates("abbaca"));
        String infix = "a+b*(c-d)";
        System.out.println("Postfix: " + infixToPostfix(infix));
        String postfix = "23*54*+9-";
        System.out.println("Evaluated: " + evalPostfix(postfix));
    }
}
