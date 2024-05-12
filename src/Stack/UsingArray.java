package Stack;

class Stack{
    static final int size = 1000;
    int top = -1;
    int[] stackArr = new int[size];

    public void push(int value){
        if(top <= size){
            stackArr[++top] = value;
        }
       else{
            System.out.println("Stack is full, can't push "+ value);
        }
    }

    public int pop(){
        if(top>=0){
            return stackArr[top--];
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public int peek(){
        if(top>=0){
            return stackArr[top];
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return (top == size-1);
    }
}
public class UsingArray {
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

    }
}
