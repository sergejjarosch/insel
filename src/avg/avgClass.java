package avg;

public class avgClass {

    public static double avg_out( double[] numbers ) {
        if ( numbers == null || numbers.length == 0 )
            throw new IllegalArgumentException( "Array null or empty");


        double sum = 0;

        for ( double n : numbers )
            sum += n;

        return sum / numbers.length;
    }
}
