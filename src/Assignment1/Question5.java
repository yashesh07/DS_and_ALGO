package Assignment1;

import java.util.*;
public class Question5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Decimal number : ");
        int n = in.nextInt();
        System.out.print("Enter the value of Base : ");
        int base = in.nextInt();
        int ans=0;
        for(int i=0;n!=0;i++)
        {
          ans = ans + n%base;
          n=n/base;
        }
        System.out.println("Sum of digits = " + ans);
    }
}
