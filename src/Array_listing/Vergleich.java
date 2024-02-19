package Array_listing;

import java.util.Arrays;

public class Vergleich {
    public static void vergleich_out(){

        String[] a = {"Asus", "Elitergroup", "MSI" };
        String[] b = {"Elitegroup", "MSI", "Shittle"};

        System.out.println( Arrays.asList( a ).subList( 1, 3 ).
                equals( Arrays.asList( b ).subList( 0, 2) ) );

    }
}
