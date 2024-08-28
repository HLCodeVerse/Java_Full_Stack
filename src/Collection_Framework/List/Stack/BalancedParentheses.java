package Collection_Framework.List.Stack;

import java.util.Stack;

public class BalancedParentheses {

//    public boolean isValid(String s){
//        Stack<Character> stack = new Stack<> ();
//        for (char c : s.toCharArray()) {
//            if (c == '(') {
//                stack.push(c);
//            } else if (c == ')') {
//                if (stack.isEmpty() || stack.pop() != '(') {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                default:
                    return false; // In case of unexpected characters
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BalancedParentheses bp = new BalancedParentheses();

        // Test cases
        System.out.println(bp.isValid("{[()]}")); // true
        System.out.println(bp.isValid("{[(])}")); // false
        System.out.println(bp.isValid("{{[[(())]]}}")); // true
        System.out.println(bp.isValid("{{([])}}")); // true
        System.out.println(bp.isValid("{[}")); // false
    }
}
