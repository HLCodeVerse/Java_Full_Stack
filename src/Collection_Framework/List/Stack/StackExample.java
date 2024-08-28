package Collection_Framework.List.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Displaying the stack
        System.out.println("Stack: " + stack);

        // Peeking the top element
        System.out.println("Top element: " + stack.peek());

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());

        // Displaying the stack after pop
        System.out.println("Stack after pop: " + stack);

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println (stack );
        System.out.println (stack.indexOf ( 20 ) );
    }
}
