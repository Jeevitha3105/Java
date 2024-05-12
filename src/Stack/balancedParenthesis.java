package Stack;
import java.util.Stack;

public class balancedParenthesis {
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){

        String s1 = "{[()]}"; // Balanced
        String s2 = "{[(])}"; // Not balanced

        System.out.println(s1 +" Is balanced ? "+isBalanced(s1));
        System.out.println(s2 + " Is balanced ? "+isBalanced(s2));

    }

}
