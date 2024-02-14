package ValidParantheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    // s containing just (, ), {, }, [, ]
    // the input is valid if:
    // open brackets must be closed by the same type of brakets
    // open brackets must be closed in the correct order
    // every close bracket has a corresponding open bracket of the same type
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((s.charAt(i) == ')' && top == '(') ||
                        (s.charAt(i) == ']' && top == '[') ||
                        (s.charAt(i) == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    /*
     Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; // Invalid character or mismatched brackets
            }
        }

        return stack.isEmpty();
     */
}
