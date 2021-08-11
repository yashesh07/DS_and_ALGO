package Lab7;

import java.util.ArrayList;

public class RadixSort {

    private void radixSort(int [] arr, int exp){
        int [] count = new int[10];
        int [] temp = new int[arr.length];
        for (int value : arr) {
            count[(value / exp) % 10]++;
        }
        for(int i = 1; i<10; i++){
            count[i] = count[i] + count[i-1];
        }
        for(int i = arr.length-1; i>=0; i--){
            temp[count[(arr[i]/exp)%10]-1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i = 0; i< arr.length; i++)
            arr[i] = temp[i];

    }

    public int [] sort(int [] arr){
        int max = arr[0];
        int exp = 1;
        for(int value : arr){
            if(value>max)   max = value;
        }
        while((max/exp)>0){
            radixSort(arr, exp);
            exp = exp * 10;
        }
        return arr;
    }
}
