package Lab7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class DriverBest {
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
        int [] bestCase = new int[list.size()];

        //sorting list in ascending order and transfer into array
        Collections.sort(list);
        for(int i = 0; i<list.size(); i++){
            bestCase[i] = list.get(i);
        }

        RadixSort s = new RadixSort();

        long start, end;

//        System.out.println("Best Case Array :");
//        System.out.println(Arrays.toString(bestCase));
        start = System.currentTimeMillis();
        s.sort(bestCase);
        end = System.currentTimeMillis();
        System.out.println("\n\n\nTime Taken for Best Case: " + (end-start));

    }
}
