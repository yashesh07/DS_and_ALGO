package Lab7;

public class HeapSort {

    private void heap(int[] arr, int nodeIndex, int length) {
        int largest = nodeIndex;
        int leftIndex = 2*nodeIndex + 1;
        int rightIndex = 2*nodeIndex + 2;
        if(leftIndex<length && arr[leftIndex]>arr[largest])   largest = leftIndex;
        if(rightIndex<length && arr[rightIndex]>arr[largest]) largest = rightIndex;
        if(largest!=nodeIndex){
            int temp = arr[nodeIndex];
            arr[nodeIndex] = arr[largest];
            arr[largest] = temp;
            heap(arr, largest, length);
        }
    }

    public int[] sort(int[] arr) {
        for (int i = (arr.length / 2) - 1; i >= 0; i--) {
            heap(arr, i, arr.length);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heap(arr, 0, i);
        }
            return arr;
    }
}