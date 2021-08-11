package Lab7;

public class QuickSort {

    private int partition(int [] arr, int low, int high){
        int pivot = arr[low];
        int i = low+1, j = high;
        do{
            while(i<=high && arr[i]<=pivot)    i++;
            while(i>=low && arr[j]>pivot)    j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }while(i<j);
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }

    private void quickSort(int [] arr, int low, int high){
        if(low<high){
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }

    public int [] sort(int[] arr){
        quickSort(arr, 0, arr.length-1);
        return arr;
    }
}
