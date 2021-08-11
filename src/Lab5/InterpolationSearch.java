package Lab5;

public class InterpolationSearch {
    public static int search(int [] a, int key){
        int high = a.length-1, low = 0;
        int pos = low + ((key-a[low])*(high-low)/(a[high]-a[low]));
        while(low<=high && key>=a[low] && key<=a[high]){
            if(a[pos]==key) return pos;
            else if(key>a[pos]){
                low = pos + 1;
                pos = low + ((key-a[low])*(high-low)/a[high]-a[low]);
            }
            else{
                high = pos - 1;
                pos = low + ((key-a[low])*(high-low)/a[high]-a[low]);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr= new int[]{0,7,14,21,25,29,32,35,40,45,47,49,50};
        System.out.println(search(arr,45));
    }
}
