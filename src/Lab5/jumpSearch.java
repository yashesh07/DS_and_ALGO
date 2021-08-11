package Lab5;

public class jumpSearch {
    public static double sqrtCustom(int n){
        double low = 0, high;
        high = n;
        double mid = (high + low)/2;
        while(true){
            if(mid*mid==n || (mid+mid>(n-0.01) && mid+mid<n) || (mid+mid<(n+0.01) && mid+mid>n))  return mid;
            else if(mid*mid>n){
                high = mid;
                mid = (high + low)/2;
            }
            else{
                low = mid;
                mid = (high + low)/2;
            }
        }
    }

    public static int search(int[]a, int key){
        int interval = (int)sqrtCustom(a.length);
        for(int i = 0; i<a.length;i=i+interval){
            if(a[i]==key)   return i;
            else if(key<a[i]) {
                for (int j = i - interval; j < i; j++)
                    if (a[j] == key) return j;
            }
            else if((i+interval)>=a.length) {
                for (int j = i; j < a.length; j++)
                    if (a[j] == key) return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,8,10,34,67,90,111,136,345,678,987};
        System.out.println(search(arr,9));
        System.out.println(search(arr,5));
        System.out.println(search(arr,10));
        System.out.println(search(arr,111));
        System.out.println(search(arr,136));
        System.out.println(search(arr,345));
        System.out.println(search(arr,678));
        System.out.println(search(arr,654));
        System.out.println(search(arr,24));
        System.out.println(search(arr,452));
        System.out.println(search(arr,987));
    }
}
