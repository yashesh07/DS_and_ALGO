package MyArray;
import java.util.Scanner;
class createArray {
    int TotalSize;
    int UsedSize;
    int [] arr = new int[15];

    public void setValue(){
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<this.UsedSize; i++){
            System.out.print("Enter the value in index number " + i + " : ");
            this.arr[i] = scan.nextInt();
        }
    }

    public createArray( int TotalSize, int UsedSize){
        this.TotalSize = TotalSize;
        this.UsedSize = UsedSize;
    }

    public void showValue() {
        for (int i = 0; i < this.UsedSize; i++) {
            System.out.println((i + 1) + " : " + arr[i]);
        }
    }

    public void updateSize(int newSize){
        if(newSize>this.TotalSize) System.out.println("You have not enough size. Try again with smaller value.");
        else{
            this.UsedSize = newSize;
            System.out.println("Size updated.");
        }
    }

    public void delete(int i){
        for(int j = i; j<this.UsedSize; j++){
            this.arr[j] = this.arr[j + 1];
        }
        this.UsedSize = this.UsedSize - 1;
    }
}