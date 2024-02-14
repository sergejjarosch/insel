package Arrays;

public class Listing49 {
    public static void output(){

        int[][] triangle = new int[8][];

        for ( int row = 0; row < triangle.length; row++){
            System.out.print( " ".repeat( 14 - 2 * row ) );

            triangle[row] = new int[ row + 1];

            for ( int col = 0; col <= row; col++) {
                if ( (col == 0) || (col == row) )
                    triangle[row] [col] = 1;
                else
                    triangle[row][col] = triangle[ row - 1][col - 1] +
                                        triangle[row -1] [col];
                System.out.printf("%3d ", triangle[row][col] );
            }
            System.out.println();
        }
    }
}
