package AlphaNumeric;

public class IsNumeric {
    public static boolean isNumeric( String string){
        if ( string == null || string.length() == 0 )
            return false;

        for ( int i = 0; i < string.length(); i++ )
            if ( !Character.isDigit( string.charAt( i ) ) )
                return false;
        return true;
    }
    public static void isNumeric_output(){
        System.out.println( isNumeric( "12345" ) );
        System.out.println( isNumeric( "12.5" ) );
        System.out.println( isNumeric( "-123" ) );
    }
}
