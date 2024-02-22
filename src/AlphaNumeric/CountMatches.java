package AlphaNumeric;

public class CountMatches {
    public static int frequency( String source, String part ){
        if ( source == null || source.isEmpty() || part == null || part.isEmpty() )
            return 0;
        int count = 0;

        for ( int pos = 0;( pos = source.indexOf( part, pos )) != -1; count++ )
            pos += part.length();
        return count;
    }
    public static void frequency_inout() {
        System.out.println( frequency("Kirschwasser, schnitzel", "sch") );
        System.out.println( frequency("kirschwasser, schnitzel", "zel") );
        System.out.println( frequency("kirschwasser, schnitzel", ""));
    }
}
