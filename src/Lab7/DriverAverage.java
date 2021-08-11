package Lab7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class DriverAverage {
    public static void main(String[] args) {

        //Creating an Array list
        ArrayList<Integer> list = new ArrayList<>();

        //Reading from file
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\yashe\\OneDrive\\Desktop\\temp\\File5.txt"));
            String s;
            while((s = bufferedReader.readLine()) != null){
                list.add(Integer.parseInt(s));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Creating arrays of average, best and worst case
        int [] averageCase = new int[list.size()];

        //Transfer data from array list into array
        for(int i = 0; i<list.size(); i++){
            averageCase[i] = list.get(i);
        }

        RadixSort s = new RadixSort();

        long start, end;

//        System.out.println("Average Case Array :");
//        System.out.println(Arrays.toString(averageCase));
        start = System.currentTimeMillis();
        s.sort(averageCase);
        end = System.currentTimeMillis();
        System.out.println("\n\n\nTime Taken for Average Case: " + (end-start));

    }
}
