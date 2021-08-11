package Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.*;

public class BucketSort {

    public int [] sort(int [] arr){
        int max = arr[0];
        for (int value : arr) {
            if (value > max) max = value;
        }
        int numberOfBuckets = (int)sqrt(arr.length);
        int divider = ((max+1)/numberOfBuckets) + 1;
        List<Integer>[] B = new List[numberOfBuckets];
        for(int i = 0; i<numberOfBuckets; i++){
            B[i] = new LinkedList<>();
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0)    B[0].add(arr[i]);
            else{
                int j = arr[i]/divider;
                B[j].add(arr[i]);
            }
        }
        int count = 0;
        for(int i = 0; i<numberOfBuckets; i++){
            Collections.sort(B[i]);
            for(int j = 0 ; j<B[i].size(); j++){
                arr[count] = B[i].get(j);
                count++;
            }
        }
        return arr;
    }
}
