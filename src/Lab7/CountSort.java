package Lab7;

public class CountSort {

    public int [] sort(int [] arr){
        int max = arr[0];
        int min = 0;

        for (int value : arr) if (value > max) max = value;
        for (int value : arr) if (value < min) min = value;

        int [] countPositive = new int[max+1];
        int [] countNegative = new int[min*(-1)+1];

        for (int value : arr) {
            if (value >= 0) countPositive[value]++;
            else {
                countNegative[-value]++;
            }
        }

        int k = -1;
        for(int i = countNegative.length-1; i>0; i--){
            for(int j = countNegative[i]; j>0; j--){
                k++;
                arr[k] = -i;
            }
        }
        for(int i = 0; i<countPositive.length; i++){
            for(int j = countPositive[i]; j>0; j--){
                k++;
                arr[k] = i;
            }
        }
        return arr;
    }
}
