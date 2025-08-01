import java.util.*;

public class BalancedParanthesis {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Opening brackets → push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Closing brackets → check top of stack
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If anything is left in stack → unbalanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[([]]][])]}";
        System.out.println("Is balanced? " + isBalanced(input));
    }
}
