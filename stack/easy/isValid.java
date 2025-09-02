package stack.easy;

import java.util.Stack;

public class isValid {
//    Approach: We use a stack to track expected closing brackets.
//    If at any point the popped element doesn’t match,
//    or the stack is not empty at the end, the string is invalid.

    public static void main(String[] args) {
        String case1 = "()[]{}"; // this is valid.
        String case2 = "([])"; // this is also valid.
        String case3 = "([)]"; // this is not also valid.
        String case4 = "[";
        String case5 = "]";
        String case6 = "((";

        System.out.printf("Is %s valid parentheses  ? %b  " ,case6, isValid(case6));
    }
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else if( c == '['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
