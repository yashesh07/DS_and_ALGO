package learning_java;

import java.util.Scanner;

public class try2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();
        long [] arr = new long[(int) n];
        for(long i = 1; i<=m; i++){
            long a = scan.nextLong();
            long b = scan.nextLong();
            long k = scan.nextLong();
            for(long j = a; j<=b; j++)
                arr[(int) j] = arr[(int) j] + k;
        }
        long max  = arr[0];
        for(long i = 0; i<n; i++)
            if(max<arr[(int) i])  max = arr[(int) i];
        System.out.println(max);
    }
}
