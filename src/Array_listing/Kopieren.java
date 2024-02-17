package Array_listing;

import java.util.Arrays;

public class Kopieren {
    public static void kopieren_out(){
        String [] names = {"Big Hunk", "Mamba", "Charms", "Gushers"};
        String [] slice1= Arrays.copyOf( names, 2 );
        System.out.println( Arrays.toString( slice1 ));
        String [] slice2 = Arrays.copyOf( names, 5);
        System.out.println( Arrays.toString( slice2 ) );

        String[] slice3 = Arrays.copyOfRange( names, 2, 4);
        System.out.println( Arrays.toString( slice3 ) );
        String[] slice4 = Arrays.copyOfRange( names, 2, 5);
        System.out.println( Arrays.toString( slice4 ) );

    }
}
