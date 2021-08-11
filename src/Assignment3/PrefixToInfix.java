package Assignment3;

import java.util.Scanner;

public class PrefixToInfix {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the valid prefix expression: ");
        String str = scan.nextLine();
        for(int i = str.length()-1; i>=0; i--){
            if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))    stack.push(str.substring(i,i+1));
            else{
                String s1 = stack.peek();
                stack.pop();
                String s2 = stack.peek();
                stack.pop();
                String s = "(" + s1 + " " + str.charAt(i) + " " + s2 + ")";
                stack.push(s);
            }
        }
        System.out.print("Infix expression: ");
        stack.show();
    }
}
