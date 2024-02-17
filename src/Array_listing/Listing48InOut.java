package Array_listing;

import java.util.Scanner;

public class Listing48InOut {
    public static void output() {
        int input = new Scanner( System.in).nextInt();
        String bin = Integer.toBinaryString( input );
        System.out.printf("Banner for %s (binary %s):%n", input, bin );
        for ( int i = 0; i < bin.length(); i++)
            switch ( bin.charAt( i ) ) {
                case '0' -> Listing48.printZero();
                case '1' -> Listing48.printOne();
            }
    }
}
