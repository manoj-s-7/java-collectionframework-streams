package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) stack.push(i);
        stack.push(10);
        System.out.println(stack);
        System.out.println(stack.capacity());
//        stack.remove(5);
//        System.out.println(stack);
        for (int i = 0;i<5;i++){
            stack.pop();
        }
        System.out.println(stack);
        System.out.println(stack.capacity());
        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.search(1)); // follows 1 based index and search from top



    }
}
