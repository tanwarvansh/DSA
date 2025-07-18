package String;

import java.util.Stack;

public class ReversePolishAnotation {
    public static void main(String[] args) {
        // Example input in Reverse Polish Notation
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        
        // Evaluate the expression and print the result 
        // The question is that postfix expression is given in the form of an array of strings
        // and we need to evaluate it using a stack.
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        // String containing valid operators
        String operators = "+-/*";
        
        // Stack to store operands during evaluation
        Stack<Integer> st = new Stack<>();

        // Iterate through each token in the input array
        for (int i = 0; i < tokens.length; i++) {
            String oper = tokens[i];
            
            // Check if the current token is an operator
            if (operators.contains(oper)) {
                // Pop the top two operands from the stack
                int num1 = st.pop();
                int num2 = st.pop();
                int res;

                // Perform the operation based on the operator
                if (oper.equals("*")) {
                    res = num2 * num1; // Multiplication
                } else if (oper.equals("+")) {
                    res = num2 + num1; // Addition
                } else if (oper.equals("-")) {
                    res = num2 - num1; // Subtraction
                } else {
                    res = num2 / num1; // Division
                }

                // Push the result back onto the stack
                st.push(res);
            } else {
                // If the token is a number, push it onto the stack
                st.push(Integer.parseInt(oper));
            }
        }

        // The final result will be the only element left in the stack
        return st.pop();
    }
}
