package Lab12;

import java.util.*;

public class MaxPriorityQueue {

    TypeOfBox[] H;
    int numberOfElements = 0;

    public MaxPriorityQueue(int size){
        H = new TypeOfBox[size];
    }

    public void insert(TypeOfBox B){
        H[numberOfElements++] = B;
        int i = numberOfElements-1;
        while(H[i].getUnits()>H[(i-1)/2].getUnits() && i>0){
            swap(i, (i-1)/2);
            i = (i-1)/2;
        }
    }

    public TypeOfBox extractMax(){
        TypeOfBox B = H[0];
        H[0] = H[(numberOfElements--)-1];
        maxHeapify(0);
        return B;
    }

    private void maxHeapify(int index){
        int largest = index;
        int leftChild = 2*index + 1;
        int rightChild = 2*index + 2;
        if(leftChild<numberOfElements && H[leftChild].getUnits()>H[largest].getUnits()) largest = leftChild;
        if(rightChild<numberOfElements && H[rightChild].getUnits()>H[largest].getUnits()) largest = rightChild;
        if(index!=largest){
            swap(index, largest);
            maxHeapify(largest);
        }
    }

    public void swap(int x, int y){
        TypeOfBox temp = H[x];
        H[x] = H[y];
        H[y] = temp;
    }
}
