package Assignment1;

import java.util.*;
import java.math.*;
public class Question1 {
    public static void main(String[] args)
    {
        System.out.print("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger n1 = BigInteger.ZERO;
        BigInteger n2 = BigInteger.ONE;
        for(int i=1; i<=n; i++)
        {
            if(i==1)
            {
                System.out.print(n2+" ");
            }
            else
            {
                BigInteger sum = n1.add(n2);
                n1 = n2;
                n2 = sum;
                System.out.print(sum+" ");
            }
        }
    }
}

