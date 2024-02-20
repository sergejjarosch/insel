package AlphaNumeric;

public class UpperLowerCase {
    public static void UpperLowerCase_InputOutput(){
         String input = new java.util.Scanner( System.in).nextLine();

         for ( int i = 0; i < input.length(); i++ ) {
             char c = input.charAt(i);
             if ( Character.isWhitespace( c ) )
                 System.out.print( '_');
             else if ( Character.isLetter( c ) )
                 System.out.print( Character.toUpperCase( c ) );
         }
    }
}
