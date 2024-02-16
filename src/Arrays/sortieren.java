package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class sortieren {
/*    public static void sort_methode(){
        double [] profits = {-1.9, 3.1, 3.2, 3};
        String[] cities = { "Xanten", "Alpen", "Wesel"};
        Arrays.sort( profits );
        Arrays.sort( cities );
        System.out.println( Arrays.toString( profits ) );
        System.out.println( Arrays.toString( cities ) );
    }

 */
public static void sort_methode_2(){

    // Wie lange soll das Array sein - -
    System.out.println("Wie lang soll das Array sein?");
    int input_num = new java.util.Scanner(System.in).nextInt();

    // Was in dem Array steht - -
    System.out.println("Was soll im ersten Teil stehen?");
    String input_a = new java.util.Scanner(System.in).nextLine();
    System.out.println("Was soll im zweiten Teil Stehen?");
    String input_b = new java.util.Scanner(System.in).nextLine();

    // Array wird befüllt mit der methode fill - -
    String[] array = new String[ input_num ];
    Arrays.fill( array, 0, array.length / 2, input_a );
    Arrays.fill( array, array.length/ 2, array.length, input_b);

    System.out.println("Soll die liste gemischt werden? J = Ja - N = Nein.");
    String shuffleOrNot = new java.util.Scanner(System.in).nextLine();

    switch ( shuffleOrNot ) {
        case "J", "j":
            Collections.shuffle(Arrays.asList(array));
            System.out.println(Arrays.toString(array));
            break;
        case "N", "n":
            System.out.println(Arrays.toString(array));
            break;
    }

    }
}
