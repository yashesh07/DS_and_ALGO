package Assignment3;

import java.util.*;

public class BracketsMatching {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string containing Brackets: ");
        String str = scan.nextLine();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='[' || str.charAt(i)=='{' || str.charAt(i)=='(')  stack.push(str.charAt(i));
            else{
                if(i>0 && str.charAt(i)==']' && stack.peek()=='[') stack.pop();
                else if(i>0 && str.charAt(i)=='}' && stack.peek()=='{') stack.pop();
                else if(i>0 && str.charAt(i)==')' && stack.peek()=='(') stack.pop();
                else{
                    System.out.println("Brackets didn't match !!");
                    break;
                }
            }
            if(i==str.length()-1){
                if(stack.isEmpty()) System.out.println("Brackets matched !!");
                else System.out.println("Brackets didn't match !!");
            }
        }
    }
}
