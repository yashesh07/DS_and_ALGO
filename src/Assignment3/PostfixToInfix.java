package Assignment3;

import java.util.Scanner;

public class PostfixToInfix {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the valid postfix expression: ");
        String str = scan.nextLine();
        for(int i = 0; i<str.length(); i++){
            if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))    stack.push(str.substring(i, i + 1));
            else{
                String s1 = stack.peek();
                stack.pop();
                String s2 = stack.peek();
                stack.pop();
                String s = "(" + s2 + " " + str.charAt(i) + " " + s1 + ")";
                stack.push(s);
            }
        }
        System.out.print("Infix expression: " + stack.peek());
    }
}
