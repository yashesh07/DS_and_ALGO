package Lab7;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws IOException {
//        int [] arr = new int[]{12,7,8,1,5,2,7,9,6,10,0,4};
        int [] arr = new int[]{4,6,12,9,27,94,100,2,7,25,23,28,24,92,74,55,42,48,68,79,85,87,92,7,6,15,23454534,4734642,4575734,234543634,23452345,57456345,463457};
//        int [] arr = new int[]{0,1,-2,-3,-32,-34,-12,-41,-23,-23};
//        int [] arr = new int[]{25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,-22,-23,-24,-25};
//        int [] arr = new int[]{4,5,1,2,3};
//        int [] arr = new int[]{4,4,4,3,3,31,1,1,1};
//        int [] arr = new int[]{1,12,9,5,6,10};
//        int [] arr = new int[]{-25,-24,-23,-22,-21,-20,-19,-18,-17,-16,-15,-14,-13,-12,-11,-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};



        RadixSort ss = new RadixSort();

        System.out.println(Arrays.toString(ss.sort(arr)));

    }

}
