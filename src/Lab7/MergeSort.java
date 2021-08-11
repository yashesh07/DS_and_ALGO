package Lab7;

public class MergeSort {

    private void merge(int [] arr, int low, int high){
        int [] temp = new int[(high+1)-low];
        int midIndex = (low + high)/2;
        int i = low, j = midIndex+1, k=0;
        while(i<=midIndex && j<=high){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=midIndex){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=high){
            temp[k] = arr[j];
            j++;
            k++;
        }
        int x = low, y = 0;
        while(x<=high){
            arr[x] = temp[y];
            x++;
            y++;
        }
    }

    private void split(int [] arr, int low, int high){
        if(low<high){
            int midIndex = (low + high)/2;
            split(arr, low, midIndex);
            split(arr, midIndex+1, high);
        }
        merge(arr, low, high);
    }

    public int [] sort(int [] arr){
        split(arr, 0, arr.length-1);
        return arr;
    }
}
