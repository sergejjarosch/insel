package AlphaNumeric;

public class ZeichenKonverter {
    public static void zeichenKonverter_inOut(){

        char[] chars ={'3', '4', '0'};
        int result = 0;
        for ( char c : chars ) {
            result = result * 10 + Character.digit( c, 10 );
            System.out.println( result );
        }
    }
}
