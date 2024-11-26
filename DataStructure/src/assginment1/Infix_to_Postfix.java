package assginment1;

import java.util.Scanner;
import java.util.Stack;

public class Infix_to_Postfix{
    
    public static int priority(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
        }
    
    public static boolean checkOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }
    public static String convert(String value) {
    	
        StringBuilder obj = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                obj.append(c);
            }
            else if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    obj.append(stack.pop());
                } if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Not valid Expression"; 
                } else {
                    stack.pop();
                }
            }else if (checkOperator(c)) {
                while (!stack.isEmpty() && priority(c) <= priority(stack.peek())) {
                    obj.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Not valid value"; 
            }
            obj.append(stack.pop());
        }
        return obj.toString();
}
    public static void main(String[] args) {
    
        
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value:");
    	String value1=sc.nextLine();
    	 
    	
    	System.out.println("Postfix  " + convert(value1));
    	sc.close();
    }
}

