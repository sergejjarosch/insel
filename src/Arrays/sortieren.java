package Arrays;

import java.util.Arrays;

public class sortieren {
    public static void sort_methode(){
        double [] profits = {-1.9, 3.1, 3.2, 3};
        String[] cities = { "Xanten", "Alpen", "Wesel"};
        Arrays.sort( profits );
        Arrays.sort( cities );
        System.out.println( Arrays.toString( profits ) );
        System.out.println( Arrays.toString( cities ) );
    }

}
