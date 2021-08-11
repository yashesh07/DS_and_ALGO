package Assignment1;

import java.util.*;
public class Question6 {
    public static void main(String[] args)
    {
        System.out.println("1. Modulus (x%y)");
        System.out.println("2. Power (x^y)");
        System.out.println("3. XOR (x XOR y)\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = in.nextInt();
        System.out.print("Enter the value of y : ");
        int y = in.nextInt();
        System.out.print("Enter the choice of operation : ");
        int op = in.nextInt();
        if(op==1)
        {
            System.out.println("Answer : "+(x%y));
        }
        else if(op==2)
        {
            System.out.println("Answer : "+Math.pow(x,y));
        }
        else if(op==3)
        {
            System.out.println("Answer : "+(x^y));
        }
    }
}
