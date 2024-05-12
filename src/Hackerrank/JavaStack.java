package Hackerrank;

import java.util.*;
class JavaStack{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();
        while (sc.hasNext()) {
            String input=sc.next();

            for(char c : input.toCharArray()){
                if(c=='(' || c=='[' || c=='{'){
                    stack.push(c);
                }
                else if(c==')' && !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else if(c==']' && !stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }
                else if(c=='}' && !stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }

            System.out.println(stack.isEmpty() ? "true" : "false");
            stack.clear();

        }

    }
}



