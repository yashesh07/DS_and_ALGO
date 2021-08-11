package Lab12;

import java.util.Scanner;

public class CompanyDelivery {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of types of boxes : ");
        int numberOfTypesOfBox = scan.nextInt();

        MaxPriorityQueue maxPriorityQueue = new MaxPriorityQueue(100);

        for(int i = 1; i<=numberOfTypesOfBox; i++){
            TypeOfBox B = new TypeOfBox();
            System.out.print("Enter number of boxes : ");
            B.setNumberOfBoxes(scan.nextInt());
            System.out.print("Enter units : ");
            B.setUnits(scan.nextInt());
            maxPriorityQueue.insert(B);
        }

        System.out.print("Enter the capacity of Truck : ");
        int truckCapacity = scan.nextInt();

        int maxUnits = 0;
        int capacity = 0;

        for(int i = 1; i<=numberOfTypesOfBox; i++){
            TypeOfBox B = maxPriorityQueue.extractMax();
            int numberOfBox = B.getNumberOfBoxes();
            int units = B.getUnits();
            int j = 1;
            while(j<=numberOfBox){
                maxUnits = maxUnits + units;
                capacity++;
                j++;
                if(capacity==truckCapacity) break;
            }
            if(capacity==truckCapacity) break;
        }

        System.out.println("\n\nMax Units " + maxUnits );
    }
}
