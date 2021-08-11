package Assignment1;

import java.util.*;
public class Question3 {
    public static void main(String[] args)
    {
        System.out.print("Enter the number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%10==0 && n%9==0)   System.out.println("YES");
        else    System.out.println("NO");
    }
}
