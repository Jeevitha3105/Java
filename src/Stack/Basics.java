package Stack;

import java.util.Stack;

public class Basics {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
//        Add elements to stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Elements in stack : " + stack);

//        removed element
        int removed = stack.pop();
        System.out.println("Removed element : "+removed);

//        Remove elements in stack
        System.out.println("After removing element : "+ stack);

        // Access element from the top
        int ele = stack.peek();
        System.out.println("Accessing element from top : "+ele);

//        Search an element
        int search = stack.search(2);
        System.out.println("Position of the element is : " + search);                   //It returns the position of the element from the top of the stack.

//        checks if stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty ? " + isEmpty);
    }
}
