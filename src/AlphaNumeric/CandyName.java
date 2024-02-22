package AlphaNumeric;

public class CandyName {
    static boolean containsCandyName( String text ) {
        text = text.toLowerCase();
        String[] candyNames = {"camel balls", "willy gum", "ding dong", "bum bum",
        "big nuts"};
        for ( String candyName : candyNames )
            if ( text.contains( candyName ) )
                return true;
        return false;
    }
    public static void Candy_inout() {
        String msg1 = "The camel balls are so delicios?";
        System.out.println( containsCandyName( msg1 ) );
        String msg2 = "I only like warm milk.";
        System.out.println( containsCandyName( msg2) );
    }
}
