package Lab5;

public class LinearSearch {
    public static int search(int[] a, int key){
        for(int i = 0; i<a.length; i++)
            if(a[i]==key) return i;
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{2,5,74,7,3,6};
        System.out.println(search(arr,2));
    }
}
