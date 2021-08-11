package Lab7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class DriverWorst {
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
        int [] worstCase = new int[list.size()];

        //sorting list in descending order and transfer into array
        Collections.sort(list, Collections.reverseOrder());
        for(int i = 0; i<list.size(); i++){
            worstCase[i] = list.get(i);
        }

        RadixSort s = new RadixSort();

        long start, end;

//        System.out.println("Worst Case Array :");
//        System.out.println(Arrays.toString(worstCase));
        start = System.currentTimeMillis();
        s.sort(worstCase);
        end = System.currentTimeMillis();
        System.out.println("\n\n\nTime Taken for Worst Case: " + (end-start));

    }
}
