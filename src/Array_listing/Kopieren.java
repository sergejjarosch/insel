package Array_listing;

import java.util.Arrays;

public class Kopieren {
    public static void kopieren_out(){
        String [] names = {"One", "Two", "Three", "Four"};

        String [] slice1= Arrays.copyOf( names, 2 );
        System.out.println( Arrays.toString( slice1 )); //<-- Output

        String [] slice2 = Arrays.copyOf( names, 5);
        System.out.println( Arrays.toString( slice2 ) );//<-- Output

        String[] slice3 = Arrays.copyOfRange( names, 2, 4);
        System.out.println( Arrays.toString( slice3 ) );//<-- Output

        String[] slice4 = Arrays.copyOfRange( names, 2, 5);
        System.out.println( Arrays.toString( slice4 ) );//<-- Output
    }

}
