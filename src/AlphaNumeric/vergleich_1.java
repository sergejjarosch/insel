package AlphaNumeric;

import java.util.Objects;

public class vergleich_1 {
    public static void vergleich_1_inout(){
        String input = javax.swing.JOptionPane.showInputDialog( "Password");
        String expected = "qwertz123";
        System.out.println( input == expected);
        System.out.println( input.equals( expected ) );
        System.out.println(Objects.equals( expected, input));
    }
}
