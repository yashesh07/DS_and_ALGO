package check;
import java.util.*;
public class DRIVER {
        public static void main(String[] args)
        {
           Obj ob = new Obj();
           ob.x = 2;
           ob.y = 4;
            System.out.println(ob.x);
            System.out.println(ob.y);
            Obj obj;
            obj = ob;
            obj.x = 5;
            obj.y = 10;
            System.out.println(ob.x);
            System.out.println(ob.y);
        }
}
