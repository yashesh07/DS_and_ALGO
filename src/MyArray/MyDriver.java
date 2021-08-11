package MyArray;
import java.util.Scanner;
public class MyDriver {
    public static void main(String[] args) {
        createArray obj = new createArray(15, 10);
        obj.setValue();
        obj.showValue();
        obj.updateSize(5);
        obj.setValue();
        obj.showValue();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the index number to be delete : ");
        int i = scan.nextInt();
        obj.delete(i);
        obj.showValue();
    }
}
