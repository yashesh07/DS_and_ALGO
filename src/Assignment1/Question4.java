package Assignment1;

import java.util.*;
public class Question4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the larger number : ");
        int x = in.nextInt();
        System.out.print("Enter the smaller number : ");
        int y = in.nextInt();
        int n1=0, n2=0, x1=x, y1=y;
        for(int i=0;x1!=0 || y1!=0;i++)
        {
            if(x1!=0)
            {
                n1=n1+1;
                x1=x1/10;
            }
            if(y1!=0)
            {
                n2=n2+1;
                y1=y1/10;
            }
        }
        int[] arrX = new int[n1];
        int[] arrY = new int[n2];
        for(int i=0;x!=0;i++)
        {
            arrX[i]=x%10;
            x=x/10;
        }
        for(int i=0;y!=0;i++)
        {
            arrY[i]=y%10;
            y=y/10;
        }
        for(int i=0; i<n2; i++)
        {
            int ans=0;
            for(int j=0; j<n1; j++)
            {
                if((arrX[j]*arrY[i])+ans>=10)
                {
                    if(j==n1-1) continue;
                    ans=((arrX[j]*arrY[i])+ans)/10;
                    System.out.print(ans);
                }
            }
        }
    }
}
