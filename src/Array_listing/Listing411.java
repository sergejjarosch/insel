package Array_listing;

import java.util.Arrays;

public class Listing411 {
    static void rotateLeft( int[] numbers ) {
        int first = numbers[ 0 ];
        System.arraycopy( numbers, 1, numbers, 0, numbers.length -1);
        numbers[ numbers.length - 1 ] = first;
    }
    static void rotateRight( int[] numbers ) {
        int last = numbers [ numbers.length - 1 ];
        System.arraycopy( numbers, 0, numbers, 1, numbers.length - 1);
        numbers[ 0 ] = last;
    }
   public static void RotateArray(){
        int[] numbers = { 1, 2, 3, 4};
        rotateLeft( numbers );
       System.out.println( Arrays.toString( numbers ) );

        rotateLeft( numbers);
       System.out.println( Arrays.toString( numbers ) );

        rotateRight( numbers );
       System.out.println( Arrays.toString( numbers ) );
   }

}
