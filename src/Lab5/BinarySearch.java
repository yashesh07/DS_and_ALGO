package Lab5;

public class BinarySearch {
    public static int search(int[] a, int key){
        int high = a.length-1, low = 0;
        int mid = (low + high)/2;
        while(low<=high && key>=a[low] && key<=a[high]){
            if(a[mid]==key) return mid;
            else if(a[mid]>key){
                high = mid - 1;
                mid = (low + high)/2;
            }
            else{
                low = mid + 1;
                mid = (low + high)/2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr= new int[]{1,3,5,9,11,13,23,25,56,79,99,145,245,467,6778,9009,10000,12543,56354};
        System.out.println(search(arr, 56354));
    }
}
