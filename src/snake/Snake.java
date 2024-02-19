package snake;
import java.awt.Point;
import java.util.Arrays;
public class Snake {
    public static void sbake_game(){

        Point playerPosition    = new Point(10, 9 );
        Point goldPosition      = new Point(6,9);
        Point doorPosition      = new Point(0, 5);
        Point [] snakePositions = new Point[5];
        int snakeIdx = 0;
        snakePositions[ snakeIdx ] = new Point( 30, 2 );
        boolean rich    = false;

        while ( true ) {
            if ( rich && playerPosition.equals( doorPosition ) ) {
                System.out.println( "You won!" );
                break;
            }
            if ( Arrays.asList( snakePositions ).contains( playerPosition ) ) {
                System.out.println( "SSSSS. You were bitten by the snake! ");
                break;
            }
            if ( playerPosition.equals( goldPosition ) ) {
                rich = true;
                goldPosition.setLocation(-1, -1);
            }
            // Draw grid and symbold
            for ( int y = 0; y < 10; y++) {
                for ( int x = 0; x < 40; x++ ) {
                    Point p = new Point( x, y );
                    if ( playerPosition.equals( p ) )
                        System.out.print('&');
                    else if ( Arrays.asList( snakePositions ).contains( p ) )
                        System.out.print( "S" );
                    else if ( goldPosition.equals( p ) )
                        System.out.print( '$' );
                    else if ( doorPosition.equals( p ) )
                        System.out.print( '#' );
                    else
                        System.out.print( '.' );
                }
                System.out.println();
            }
            // Console Input and change player position

            switch ( new java.util.Scanner( System.in ).next() ) {
                case "w" -> playerPosition.y = Math.max( 0, playerPosition.y -1);
                case "s" -> playerPosition.y = Math.min( 9, playerPosition.y +1);
                case "a" -> playerPosition.x = Math.max( 0, playerPosition.x - 1);
                case "d" -> playerPosition.x = Math.min( 39, playerPosition.x +1);
            }
            // Snake moves towards the player
            Point snakeHead = new Point( snakePositions[snakeIdx].x,
                                        snakePositions[snakeIdx].y );

            if ( playerPosition.x < snakeHead.x )
                snakeHead.x--;
            else if ( playerPosition.x > snakeHead.x )
                snakeHead.x++;
            if ( playerPosition.y < snakeHead.y )
                snakeHead.y--;
            else if ( playerPosition.y > snakeHead.y )
                snakeHead.y++;

            snakeIdx = ( snakeIdx + 1) % snakePositions.length;
            snakePositions[snakeIdx] = snakeHead;
        } // end while
    }

}
