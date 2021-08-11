package Assignment1;

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a string : ");
            String str = in.nextLine();
            str=str.toLowerCase();
            System.out.print(Character.toUpperCase(str.charAt(0)));
            for(int i=1; i<str.length(); i++)
            {
                if(str.charAt(i)==' ')
                {
                    System.out.print(str.charAt(i));
                    System.out.print(Character.toUpperCase(str.charAt(++i)));
                }
                else
                {
                    System.out.print(str.charAt(i));
                }
            }
        }
}
